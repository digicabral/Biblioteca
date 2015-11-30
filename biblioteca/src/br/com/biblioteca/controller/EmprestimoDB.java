
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Emprestimo;
import java.util.ArrayList;
import java.util.List;


public class EmprestimoDB implements LogAplicacao{
    private List<Emprestimo> emprestimos;
    public EmprestimoDB(){
        emprestimos = new ArrayList<>();
    }
    public void inserirEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        gravaLog("Emprestimo Inserido por - " + emprestimo.getFuncionario());
        gravaLog("Emprestado para: " + emprestimo.getAluno());
        gravaLog("Livro:  " + emprestimo.getLivro());
        gravaLog("Data de entrega: \n-----------" + emprestimo.getDataEntrega());
    }
    public List<Emprestimo> retornarTodos(){
        return emprestimos;
    }
    @Override
    public void gravaLog (String log){
        System.out.println("Novo Emprestimo " + log);
    }
    
}
