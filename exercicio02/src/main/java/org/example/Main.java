package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem orc = new Personagem();
        orc.nome = "Orc";
        orc.vida = 100;
        orc.ataque = 10;

        Personagem goblin = new Personagem();
        goblin.nome = "Goblin";
        goblin.vida = 50;
        goblin.ataque = 5;

        Personagem lobo = new Personagem();
        lobo.nome = "Lobo";
        lobo.vida = 75;
        lobo.ataque = 15;

        Personagem[] inimigos ={orc,goblin,lobo};

        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 100;
        jogador.ataque = 20;

        Random geradorAleatorio = new Random();

         int totalVida = somaVida(inimigos);

        while (jogador.vida > 0 && totalVida > 0){
            int alvo = geradorAleatorio.nextInt(0,3);
            jogador.atacar(inimigos[alvo]);
            for (Personagem inimigo : inimigos){
                inimigo.atacar(jogador);
            }
            totalVida = somaVida(inimigos);
        }
    }
    public static int somaVida(Personagem[] inimigos){
        int totalVida = 0;
        for (Personagem inimigo : inimigos) {
            totalVida += inimigo.vida;
        }
        return totalVida;
    };
}



