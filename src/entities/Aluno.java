package entities;


import java.util.Date;

public class Aluno extends Usuario{
    private Double matricula;
    private String curso;

    public Aluno(String nome, Date nascimento, String sexo, String email, Double matricula, String curso) {
        super(nome, nascimento, sexo, email);
        this.matricula = matricula;
        this.curso = curso;
    }


}
