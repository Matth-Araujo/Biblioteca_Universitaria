package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alugar {
    private Date momento;
    private Usuario usuario;
    private List<Livro> livros = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Alugar() {
    }

    public Alugar(Date momento, Usuario usuario) {
        this.momento = momento;
        this.usuario = usuario;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }
    public void removeLivro(Livro livro){
        livros.remove(livro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Usuario: ");
        sb.append(usuario + "\n");
        sb.append("Livros do pedido:\n");
        for (Livro livro : livros) {
            sb.append(livro.getTitulo()).append(" - ").append(livro.getNomeAutor()).append("\n");
        }
        return sb.toString();
    }
}
