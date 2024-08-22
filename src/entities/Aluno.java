package entities;

import java.util.Date;

public class Aluno extends Usuario{
    private Integer matricula;
    private String grauFormacao;

    public Aluno(String nome, Date nascimento, String sexo, String email, Integer senha, String tipoUsuario, Integer matricula, String grauFormacao) {
        super(nome, nascimento, sexo, email, senha, tipoUsuario);
        this.matricula = matricula;
        this.grauFormacao = grauFormacao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getGrauFormacao() {
        return grauFormacao;
    }

    public void setGrauFormacao(String grauFormacao) {
        this.grauFormacao = grauFormacao;
    }
}
