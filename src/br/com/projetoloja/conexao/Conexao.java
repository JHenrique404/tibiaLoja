package br.com.projetoloja.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    
    private static final String DB_NAME = "bdtibia";
    private static final String URL = "jdbc:mysql://localhost/" + DB_NAME;
    
    private static final String USUARIO = "root";
    private static final String SENHA = "1234";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(ClassNotFoundException | SQLException errorSql){
            throw new RuntimeException("Erro! Não foi possível conectar " + errorSql);
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ErroSql){
            throw new RuntimeException("ERRO: Não foi possível fechar a conexão " + ErroSql);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstm){
        closeConnection(con);
        try{
            if(pstm != null){
                pstm.close();
            }
        }catch(SQLException ErroSql){
            throw new RuntimeException("ERRO: Não foi possível fechar o PreparedStatement " + ErroSql);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs){
        closeConnection(con, pstm);
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ErroSql){
            throw new RuntimeException("ERRO: Não foi possível fechar o ResultSet " + ErroSql);
        }
    }
}
