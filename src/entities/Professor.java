package entities;

import java.util.Date;

public class Professor extends Usuario{
    private String materiasMinistradas;
    private String centro;

    public Professor(String nome, Date nascimento, String sexo, String email, Integer senha, String tipoUsuario, String materiasMinistradas, String centro) {
        super(nome, nascimento, sexo, email, senha, tipoUsuario);
        this.materiasMinistradas = materiasMinistradas;
        this.centro = centro;
    }

    public String getMateriasMinistradas() {
        return materiasMinistradas;
    }

    public void setMateriasMinistradas(String materiasMinistradas) {
        this.materiasMinistradas = materiasMinistradas;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
