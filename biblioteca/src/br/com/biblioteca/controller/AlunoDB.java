package br.com.biblioteca.controller;

import br.com.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDB implements LogAplicacao{
    
    private List<Aluno> alunos;
    public AlunoDB(){
        alunos = new ArrayList<>();
            }    
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
        gravaLog("Aluno Inserido - " + aluno.getNome());
    }    
    public List<Aluno> retornarTodos(){
        return alunos;
    }
    @Override
    public void gravaLog (String log){
        System.out.println(log);
    }
            
}
