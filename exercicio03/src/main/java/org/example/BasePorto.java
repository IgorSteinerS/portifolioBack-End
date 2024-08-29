package org.example;


import java.util.ArrayList;

public class BasePorto {
    protected String nome;
    protected ArrayList<Barco> barcosAtracados = new ArrayList<>();


    public BasePorto(String nome){
        this.nome = nome;
    }
    public BasePorto(){
    }
    public String getNome(){
        return this.nome;
    }
    public Boolean atracarBarco(Barco novo){
        barcosAtracados.add(novo);
        return true;
    }

    public void desatracarBarco(Barco antigo){
        barcosAtracados.remove(antigo);
    }

    public void mostrar(){
        for (Barco barco : barcosAtracados) {
            System.out.println("- " + barco.getNome() + " / " + barco.getTamanho());
        }
    }
}