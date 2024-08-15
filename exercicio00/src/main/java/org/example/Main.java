package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite seu primeiro nome:");
            String primeiroNome = leitor.nextLine();
            if(primeiroNome.isEmpty()) return;
            System.out.println("Digite seu segundo nome:");
            String segundoNome = leitor.nextLine();

            if(segundoNome.isEmpty()) return;

            Random geradorAleatorio = new Random();
            int numeroAleatorio = geradorAleatorio.nextInt(10,100);

            System.out.println(primeiroNome + segundoNome + numeroAleatorio);

        }
    }
}