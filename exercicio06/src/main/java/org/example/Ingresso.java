package org.example;

public class Ingresso {
    private Cliente cliente;
    private String filme;
    private String assento;

    public void setCliente(String nome, int idade){
        Cliente cliente = new Cliente(nome, idade);
        this.cliente = cliente;

    }

    public String getAssento(){
        return this.assento;
    }
    public void setAssento(String assento){
        this.assento = assento;
    }

    public String getFilme(){
        return this.filme;
    }
    public void setFilme(String filme){
        this.filme = filme;
    }
}