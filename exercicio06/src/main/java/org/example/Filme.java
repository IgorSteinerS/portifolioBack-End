package org.example;

public class Filme {
    private String nome;
    private Integer preco;
    private int idadeMinima;

    public Filme(String nome, Integer preco, int idadeMinima){
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdadeMinima(){
        return this.idadeMinima;
    }
}
