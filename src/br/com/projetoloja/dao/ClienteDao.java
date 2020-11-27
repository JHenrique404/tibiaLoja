package br.com.projetoloja.dao;

import br.com.projetoloja.conexao.Conexao;
import br.com.projetoloja.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDao {
    public void inserir(Cliente cliente){
        Connection con = Conexao.getConnection();
        PreparedStatement pstm = null;
        
        try{
            String querySql = "INSERT INTO CLIENTES(nome, senha, email, telefone) VALUES (?,?,?,?);";
            pstm = con.prepareStatement(querySql);
            
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSenha());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getTelefone());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao banco: \n" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
    }
    
    public void alterar(Cliente cliente){
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        
        try{
            String querySql = "UPDATE CLIENTES SET NOME = ?, SENHA = ?, EMAIL = ?, TELEFONE = ? WHERE IDCLIENTE = ?;";
            pstm = con.prepareStatement(querySql);
            
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSenha());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getTelefone());
            pstm.setInt(5, cliente.getIdCliente());
            
            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso", "Alterado", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao alterar: \n" + ErroSql, "Não Alterado" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
        
    }
    
    public void remover(Cliente cliente){
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        
        try{
            String querySql = "DELETE FROM CLIENTES WHERE IDCLIENTE=? AND NOME=?;";
            pstm = con.prepareStatement(querySql);
            
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2, cliente.getNome());
        
            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso", "Removido", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao remover: \n" + ErroSql, "Não Removido" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
        
    }
    
    public List<Cliente> listar(){
        List<Cliente> clientes = new ArrayList();
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("SELECT * FROM CLIENTES;");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setSenha(rs.getString(3));
                cliente.setEmail(rs.getString(4));
                cliente.setTelefone(rs.getString(5));
                
                clientes.add(cliente);     
            }
            
        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados: \n" + ErroSql, "Não Listado" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm, rs);
        }
      
        return clientes;
    }
}

