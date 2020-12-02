package br.com.projetoloja.modelo;

public class Cliente {
    private int idCliente;
    private String nome, senha, email, telefone;

    
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idcliente) {
        this.idCliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
