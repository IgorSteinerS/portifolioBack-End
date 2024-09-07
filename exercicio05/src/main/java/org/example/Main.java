package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Postagem postagem = new Postagem();

        System.out.println("Digite o titulo: ");
        String titulo = scanner.nextLine();
        postagem.setTitulo(titulo);
        System.out.println("Digite a descrição da postagem: ");
        String descricao = scanner.nextLine();
        postagem.setDescricao(descricao);
        System.out.println("Qual é o tipo da postagem (imagem - texto - video): ");
        String tipo = scanner.nextLine();
        postagem.setTipo(tipo);

        Fotogram fotogram = new Fotogram();
        AnyTube anytube = new AnyTube();
        MyBook mybook = new MyBook();

        try {
            if (tipo.equalsIgnoreCase("imagem")) {
                mybook.compartilharImagem(postagem);
                fotogram.compartilharImagem(postagem);
                anytube.compartilharImagem(postagem);
            } else if (tipo.equalsIgnoreCase("texto")) {
                mybook.compartilharPostagem(postagem);
                anytube.compartilharPostagem(postagem);
                fotogram.compartilharPostagem(postagem);
            } else if (tipo.equalsIgnoreCase("video")) {
                mybook.compartilharVideo(postagem);
                fotogram.compartilharVideo(postagem);
                anytube.compartilharVideo(postagem);
            } else {
                System.out.println("Tipo de postagem inesperado: " + postagem.getTipo());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

