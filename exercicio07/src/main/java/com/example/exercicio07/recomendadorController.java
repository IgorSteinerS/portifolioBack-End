package com.example.exercicio07;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class recomendadorController {
    private final String[] films = {"Homens de Preto", "Arrival", "Shrek", "Gladiador"};
    private final int[][] filmMap = {
            {0, 1},
            {2, 3}
    };

    @GetMapping("/recommend")
    public String recomendarFilme(

            @RequestParam(value = "ambientacao") int answer01,
            @RequestParam(value = "genero") int answer02) {

            if (answer01 < 1 || answer01 > 2 || answer02 < 1 || answer02 > 2) {
                return "Opções invalidas, por favor selecione valores de 1 á 2.";
            }

            String recommended = films[filmMap[answer01 - 1][answer02 - 1]];
            return "Recomendo assistir: " + recommended;
    }
}
