package entities;

public class Livro {
    private String titulo;
    private String nomeAutor;
    private String lancamento;
    private String idioma;
    private String editora;
    private String genero;
    private Integer codigoLivro;

    public Livro() {
    }

    public Livro(String titulo, String nomeAutor, String lancamento, String idioma, String editora, String genero, Integer codigoLivro) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.lancamento = lancamento;
        this.idioma = idioma;
        this.editora = editora;
        this.genero = genero;
        this.codigoLivro = codigoLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
}
