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

}
