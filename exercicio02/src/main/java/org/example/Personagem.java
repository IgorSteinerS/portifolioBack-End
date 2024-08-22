package org.example;

public class Personagem {
    public String nome;
    public Integer vida;
    public Integer ataque;

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0){
            System.out.println(this.nome + " foi derrotado.");
        }else {
            System.out.println(this.nome + " está com " + this.vida + " de vida.");
        }
    }

    public void atacar (Personagem alvo) {
        if (alvo.vida <= 0){
            System.out.println("O ataque falhou");
        } else {
            System.out.println(this.nome + " atacou " + alvo.nome);
            alvo.receberDano(this.ataque);
        }
    }
}
