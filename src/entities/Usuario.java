package entities;


import java.util.Date;

public class Usuario {
    private String nome;
    private Date nascimento;
    private String sexo;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario(String nome, Date nascimento, String sexo, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + " - "+email;
    }
}
