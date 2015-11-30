
package br.com.biblioteca.controller;
import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroDB implements LogAplicacao{
    private List<Livro> livros;
    public LivroDB(){
        livros = new ArrayList<>();
    }
    public void inserirLivro(Livro livro){
        livros.add(livro);
        gravaLog("Livro Inserido - " + livro.getNome());
    }
    public List<Livro> retornarTodos(){
        return livros;
    }
    @Override
    public void gravaLog (String log){
        System.out.println("Novo Livro " + log);
    }
    
}
