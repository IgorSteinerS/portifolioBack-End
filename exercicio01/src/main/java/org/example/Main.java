package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String[] Films = {"Homens de Preto", "Arrival", "Shrek", "Gladiador"};

        System.out.println("Pergunta 1: Que ambientação você prefere?");
        System.out.println("1. Sci-fi");
        System.out.println("2. Medieval");
        try {
            int answer01 = reader.nextInt();


        System.out.println("Pergunta 2: Que gênero você prefere?");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");

        int answer02 = reader.nextInt();

        int[][] filmDict = {
                {0,1},
                {2,3}};

        String recommended = Films[filmDict[answer01-1][answer02 -1]];

        System.out.println("recomendo assistir:" + " " + recommended);

        } catch (Exception e) {
            return;
        }

        /*if (answer01 == 1 && answer02 == 1){
            System.out.println("Recomendo assistir: Homens de Preto");
        };

        if (answer01 == 1 && answer02 == 2){
            System.out.println("Recomendo assistir: Arrival");
        };

        if (answer01 == 2 && answer02 == 1){
            System.out.println("Recomendo assistir: Shrek");
        };

        if (answer01 == 2 && answer02 == 2){
            System.out.println("Recomendo assistir: Gladiador");
        };*/
    }
}

