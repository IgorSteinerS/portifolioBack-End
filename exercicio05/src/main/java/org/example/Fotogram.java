package org.example;

public class Fotogram implements PlataformaSocial{

    public void compartilharPostagem(Postagem postagem) {

        throw new RuntimeException("Ocorreu um erro ao compartilhar essa postagem no Fotogram");
    }
    public void compartilharImagem(Postagem postagem){
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }

    public void compartilharVideo(Postagem postagem){
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }
}
