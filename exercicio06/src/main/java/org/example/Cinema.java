package org.example;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    private ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarFilme(String nome, Integer preco, int idadeMinima){
        Filme filme = new Filme(nome, preco, idadeMinima);
        filmesDisponiveis.add(filme);
    }

    public void adicionarIngresso(Ingresso ingresso){
        ingressosVendidos.add(ingresso);
    }

    public Filme buscarFilme(String nomeFilme) {
        for (Filme item : filmesDisponiveis) {
            if (item.getNome().toLowerCase().equals(nomeFilme.toLowerCase())) return item;
        }
        throw new RuntimeException("O filme "+ nomeFilme +" não foi encontrado");
    }

    public void checarIdade(String nomeFilme, int idade){
        Filme filme = buscarFilme(nomeFilme);
        if (idade < filme.getIdadeMinima()){
            throw new RuntimeException("Você precisa ter no minimo "+ filme.getIdadeMinima() +" anos para assistir esse filme");
        }
    }

   public void checarAssento(String assento, Ingresso ingresso, String nomeFilme){

        for (Ingresso item : ingressosVendidos){
            if (item.getAssento().toLowerCase().equals(assento.toLowerCase()) && item.getFilme().toLowerCase().equals(nomeFilme.toLowerCase())){
                throw new RuntimeException("O assento "+ assento +" está indisponível");
            }
        }
    }
}
