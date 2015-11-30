package br.com.biblioteca.model;

public class Editora {
    
    private String nome;
    private String codigo;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return this.codigo + " - " + nome;
    }
    
    
}
