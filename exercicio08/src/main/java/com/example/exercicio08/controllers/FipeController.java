package com.example.exercicio08.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;

@RestController
@RequestMapping("/fipe")
public class FipeController {

    private RestClient cliente = RestClient.create("https://parallelum.com.br");

    @GetMapping("/valor")
    @ResponseBody //Transforma em json
    public HashMap<String, String> valor(@RequestParam String marca,
                                         @RequestParam String modelo,
                                         @RequestParam String ano){


        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/"+ marca +"/modelos/"+ modelo +"/anos/" + ano)
                .retrieve()
                .body(HashMap.class);



        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        respostaPersonalizada.put("Valor", resposta.get("Valor"));
        respostaPersonalizada.put("MesReferencia",resposta.get("MesReferencia"));

//fipe/valor?marca=59&modelo=5940&ano=2014-3


        return respostaPersonalizada;
    }
}
