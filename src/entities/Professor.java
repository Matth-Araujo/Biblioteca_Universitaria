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
}
