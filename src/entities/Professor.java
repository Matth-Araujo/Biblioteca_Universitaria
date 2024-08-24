package entities;

import java.util.Date;

public class Professor extends Usuario{
    private String especializacao;
    private String centro;

    public Professor(String nome, Date nascimento, String sexo, String email, String especializacao, String centro) {
        super(nome, nascimento, sexo, email);
        this.especializacao = especializacao;
        this.centro = centro;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
