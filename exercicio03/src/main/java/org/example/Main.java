package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();

        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 10));
        barcos.add(new Barco("Barco 5", 12));
        barcos.add(new Barco("Barco 6", 20));

        PortoPequeno porto01 = new PortoPequeno("Porto Pequeno");
        PortoGrande porto02 = new PortoGrande("Porto Grande");

        for (Barco novo : barcos){
            if (porto01.atracarBarco(novo)){
            } else {
                porto02.atracarBarco(novo);
            }
        }


    }
}


