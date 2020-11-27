package br.com.projetoloja.dao;

import br.com.projetoloja.conexao.Conexao;
import br.com.projetoloja.modelo.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProdutoDao {
    public void inserir(Produtos produto){
        Connection con = Conexao.getConnection();
        PreparedStatement pstm = null;
        
        try{
            String querySql = "INSERT INTO PRODUTOS(nomeProduto, qtd, descProduto, precoProduto) VALUES (?,?,?,?);";
            pstm = con.prepareStatement(querySql);
            
            pstm.setString(1, produto.getNomeProduto());
            pstm.setInt(2, produto.getQtd());
            pstm.setString(3, produto.getDescProduto());
            pstm.setDouble(4, produto.getPrecoProduto());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao banco: \n" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
    }
    
    public void alterar(Produtos produto){
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        
        try{
            String querySql = "UPDATE PRODUTOS SET NOMEPRODUTO = ?, QTD = ?, DESCPRODUTO = ?, PRECOPRODUTO = ? WHERE IDPRODUTO = ?;";
            pstm = con.prepareStatement(querySql);
            
            pstm.setString(1, produto.getNomeProduto());
            pstm.setInt(2, produto.getQtd());
            pstm.setString(3, produto.getDescProduto());
            pstm.setDouble(4, produto.getPrecoProduto());
            pstm.setInt(5, produto.getIdProduto());
            
            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso", "Alterado", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao alterar: \n" + ErroSql, "Não Alterado" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
        
    }
    
    public void remover(Produtos produto){
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        
        try{
            String querySql = "DELETE FROM PRODUTOS WHERE IDPRODUTO=?;";
            pstm = con.prepareStatement(querySql);
            
            pstm.setInt(1, produto.getIdProduto());
        
            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso", "Removido", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao remover: \n" + ErroSql, "Não Removido" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm);
        }
        
    }
    
    public List<Produtos> listar(){
        List<Produtos> produtos = new ArrayList();
        Connection con = Conexao.getConnection();
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("SELECT * FROM PRODUTOS;");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Produtos produto = new Produtos();
                
                produto.setIdProduto(rs.getInt(1));
                produto.setNomeProduto(rs.getString(2));
                produto.setQtd(rs.getInt(3));
                produto.setDescProduto(rs.getString(4));
                produto.setPrecoProduto(rs.getDouble(5));
                
                produtos.add(produto);     
            }
            
        } catch (SQLException ErroSql) {
            System.out.println(ErroSql.getStackTrace()[0]);
            JOptionPane.showMessageDialog(null, "Erro ao listar dados: \n" + ErroSql, "Não Listado" , JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.closeConnection(con, pstm, rs);
        }
      
        return produtos;
    }
}
