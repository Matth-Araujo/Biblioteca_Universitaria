package entities;

import java.util.ArrayList;
import java.util.List;

public class CadastroLivro {
    private List<Livro> livros = new ArrayList<>();

    public CadastroLivro() {
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
        sb.append("Livros cadastrados:\n");
        for (Livro livro : livros){
            sb.append(livro.getTitulo()).append(" - ").append(livro.getNomeAutor()).append("\n");
        }
        return sb.toString();
    }
}
