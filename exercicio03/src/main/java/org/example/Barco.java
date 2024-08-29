package org.example;

public class Barco {
    private String nome;
    private Integer tamanho;

    public Barco(String nome, Integer tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getTamanho() {
        return tamanho;
    }

}
