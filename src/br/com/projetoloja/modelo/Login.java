package br.com.projetoloja.modelo;

public class Login {
    private int idLogin;
    private String usuario;
    private String senha;
    private String createdAt;
    private static String nomeUsuario;
    
    public static void clienteAtual(String nome){
        nomeUsuario = nome;
    }   
    
    public static String clienteAtual(){
        return nomeUsuario;
    }
    
    
    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
