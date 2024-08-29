package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMusica spotify = new RepositorioMusica();

        spotify.adicionarMusica("Virtual Insanity", "Jamiroquai");
        spotify.adicionarMusica("Lone Digger", "Caravan Palace");
        spotify.adicionarMusica("Red Coat", "Suneohair");
        spotify.adicionarMusica("Odoriko", "Vaundy");

        Scanner leitor = new Scanner(System.in);

        String nomePlaylist;
        do {
            System.out.println("Digite o nome da Playlist:");
            nomePlaylist = leitor.nextLine();
            if (nomePlaylist.trim().isEmpty()) {
                System.out.println("Por favor, insira um nome válido para a playlist.");
            }
        } while (nomePlaylist.trim().isEmpty());

        Playlist playlist = new Playlist(nomePlaylist);


            int colocar = 0;

            while (colocar < 2) {
            System.out.println("Digite o nome da Musica:");
            String nomeMusica = leitor.nextLine();

            try {
                Musica musicaPesquisada = spotify.pesquisarMusica(nomeMusica);
                System.out.println(musicaPesquisada.getNome() + " - foi adicionada a playlist.");
                playlist.addLista(musicaPesquisada);

            } catch (RuntimeException exception) {
                System.out.println("Erro! " + exception.getMessage());
            }

            while (true) {
                try {
                    System.out.println("Para adicionar mais uma música digite 1, para concluir digite 2");
                    int escolha = leitor.nextInt();
                    leitor.nextLine(); //limpa o buffer de entrada após ler números inteiros
                    if (escolha == 1) {
                        colocar = 1;
                        break;
                    } else if (escolha == 2) {
                        System.out.println(playlist.getNome() +":");
                        playlist.getPlaylist();
                        colocar = 2;
                        break;
                    }else{
                        System.out.println("Digite |1| ou |2|");
                    }} catch (Exception e){
                        System.out.println("Digite |1| ou |2|");
                        leitor.nextLine();
                    }
                }
            }

                }
            }
