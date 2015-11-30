
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDB implements LogAplicacao{
        private List<Funcionario> funcionarios;
    public FuncionarioDB(){
        funcionarios = new ArrayList<>();
        
    }
    
    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        gravaLog("Funcionario Inserido - " + funcionario.getNome());
    }
    
    public List<Funcionario> retornarTodos(){
        return funcionarios;
    }
    @Override
    public void gravaLog (String log){
        System.out.println(log);
    }
            
}
