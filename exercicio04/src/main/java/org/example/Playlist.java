package org.example;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> listaMusicas = new ArrayList<>();

    public Playlist(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void addLista(Musica musica){
        listaMusicas.add(musica);
    }

    public void getPlaylist (){
        if (listaMusicas.isEmpty()){
            System.out.println("A playlist está vazia");
        } else {
            for (Musica musica : listaMusicas) {
                System.out.println("- " + musica.getNome() + " / " + musica.getArtista());
            }
        }
    }
}
