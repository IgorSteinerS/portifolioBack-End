package org.example;

import java.util.ArrayList;

public class RepositorioMusica {
    private ArrayList<Musica> musicasDisponiveis = new ArrayList<>();


    public void adicionarMusica(String nome, String artista){
        Musica musica = new Musica(nome, artista);
        musicasDisponiveis.add(musica);
    }
    public Musica pesquisarMusica(String termo) {
        for (Musica item : musicasDisponiveis) {
            if (item.getNome().toLowerCase().equals(termo)) return item; // equals -> == que funciona com objetos diferentes
        }
        throw new RuntimeException("a música "+ termo +" não foi encontrada");
    }
}
