package org.example;

public class PortoGrande extends BasePorto{
    @Override
    public Boolean atracarBarco(Barco novo){
        if (novo.getTamanho() >= 10){
            System.out.println(novo.getNome() + " atracou no " + this.getNome());
            barcosAtracados.add(novo);
            return true;
        }
        return false;
    }
    public PortoGrande(String nome){
        this.nome = nome;
    }
}
