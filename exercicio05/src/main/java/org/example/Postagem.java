package org.example;

public class Postagem {
    private String titulo;
    private String descricao;
    private String tipo; // (texto, imagem, video).

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
