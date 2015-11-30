package br.com.biblioteca.model;

public class Emprestimo {
    
    private String dataEntrega;
    private Livro Livro;
    private Funcionario funcionario;
    private Aluno aluno;

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the LIvro
     */
    public Livro getLivro() {
        return Livro;
    }

    /**
     * @param Livro the LIvro to set
     */
    public void setLivro(Livro Livro) {
        this.Livro = Livro;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    @Override
    public String toString(){
        return this.funcionario + " - " + funcionario;
    }
}
