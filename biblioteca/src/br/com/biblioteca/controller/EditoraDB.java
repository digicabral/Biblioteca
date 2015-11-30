package br.com.biblioteca.controller;

import br.com.biblioteca.model.Editora;
import java.util.ArrayList;
import java.util.List;

public class EditoraDB implements LogAplicacao{
    
    private List<Editora> editoras;
    public EditoraDB(){
        editoras = new ArrayList<>();
    }
    public void inserirEditora(Editora editora){
        editoras.add(editora);
        gravaLog("Editora Inserida - " + editora.getNome());
    }
    public List<Editora> retornarTodos(){
        return editoras;
    }
    @Override
    public void gravaLog (String log){
        System.out.println("Nova Editora " + log);
    }
}
