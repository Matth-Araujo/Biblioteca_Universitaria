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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAreaInteresse() {
        return areaInteresse;
    }

    public void setAreaInteresse(String areaInteresse) {
        this.areaInteresse = areaInteresse;
    }
}
