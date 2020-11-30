package br.com.projetoloja.dao;

import br.com.projetoloja.conexao.Conexao;
import br.com.projetoloja.modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoloja.HomePosLogin;

public class LoginDao {
    
    public boolean listar(Login l){
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("Select usuario, senha from login where usuario = ? and senha = ?");
            pstm.setString(1, l.getUsuario());
            pstm.setString(2, l.getSenha());
            
            rs = pstm.executeQuery();
            
            int index = 0;
            while(rs.next()){
                index++;
                System.out.println(index);
                
            }
       
           
            if(index == 1){
                HomePosLogin homi = new HomePosLogin();
                homi.setVisible(true);
                return true;
            }
            
        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados: \n" + ErroSql, "Não Listado" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return false;
    }
}
