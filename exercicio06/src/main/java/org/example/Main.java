package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme("Paprika", 23, 16);
        cinema.adicionarFilme("Look Back", 22, 16);
        cinema.adicionarFilme("Gyo", 20, 18);
        cinema.adicionarFilme("Kizumonogatari I", 23, 18);
        cinema.adicionarFilme("Koe no Katachi", 23, 16);

        while(true){
            Ingresso ingresso = new Ingresso();

            System.out.println("Qual o seu nome?");
            String nomeCliente = scanner.nextLine();

            System.out.println("Qual a sua idade?");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Que filme você deseja assistir?");
            String nomeFilme = scanner.nextLine();

            System.out.println("Qual assento você deseja? (de A1 a F5)");
            String assento = scanner.nextLine();

            ingresso.setCliente(nomeCliente, idadeCliente);

            try {
                cinema.checarIdade(nomeFilme, idadeCliente);
                cinema.checarAssento(assento, ingresso, nomeFilme);
                ingresso.setFilme(nomeFilme);
                ingresso.setAssento(assento);

                cinema.adicionarIngresso(ingresso);

                System.out.println("O ingresso foi vendido com sucesso : " + nomeFilme + " - " + assento.toUpperCase() + " - " + nomeCliente);
            } catch (RuntimeException exception) {
                System.out.println("Erro! " + exception.getMessage());
            }
        }



    }
}