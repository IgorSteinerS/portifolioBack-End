package com.example.exercicio12.models;

public class TransacaoEntidade {
    private ContaEntidade origem;
    private ContaEntidade destino;
    private Double valor;

    // Getters e Setters
    public ContaEntidade getOrigem() {
        return origem;
    }

    public void setOrigem(ContaEntidade origem) {
        this.origem = origem;
    }

    public ContaEntidade getDestino() {
        return destino;
    }

    public void setDestino(ContaEntidade destino) {
        this.destino = destino;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}