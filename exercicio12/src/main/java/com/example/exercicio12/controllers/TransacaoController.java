package com.example.exercicio12.controllers;

import com.example.exercicio12.dtos.TransacaoRequestDTO;
import com.example.exercicio12.dtos.TransacaoResponseDTO;
import com.example.exercicio12.services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping("/transacao")
    @ResponseBody
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO DTO) {
        return transacoesService.criarTransacao(DTO);
    }
}
