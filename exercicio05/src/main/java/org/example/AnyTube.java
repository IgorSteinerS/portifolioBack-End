package org.example;

public class AnyTube implements PlataformaSocial{
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
    public void compartilharImagem(Postagem postagem){
        throw new RuntimeException("Ocorreu um erro ao compartilhar essa postagem no AnyTube");
    }

    public void compartilharVideo(Postagem postagem){
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
}
