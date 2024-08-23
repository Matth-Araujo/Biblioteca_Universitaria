package entities;

import java.util.Date;

public class Funcionario extends Usuario {
    private String departamento;
    private String areaInteresse;

    public Funcionario(String nome, Date nascimento, String sexo, String email, String departamento, String areaInteresse) {
        super(nome, nascimento, sexo, email);
        this.departamento = departamento;
        this.areaInteresse = areaInteresse;
    }
}
