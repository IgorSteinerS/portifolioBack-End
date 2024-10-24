package com.example.exercicio12.services;

import com.example.exercicio12.dtos.ContaDTO;
import com.example.exercicio12.dtos.TransacaoRequestDTO;
import com.example.exercicio12.dtos.TransacaoResponseDTO;
import com.example.exercicio12.mappers.ContaMapper;
import com.example.exercicio12.models.ContaEntidade;
import com.example.exercicio12.models.TransacaoEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private List<ContaEntidade> contas = new ArrayList<>();

    public TransacoesService() {
        ContaDTO conta01 = new ContaDTO("500-1", "Fulano");
        ContaDTO conta02 = new ContaDTO("320-2", "Ciclano");

        ContaEntidade fulano = new ContaEntidade();

        fulano.setCodigo(conta01.codigo());
        fulano.setCliente(conta01.cliente());

        ContaEntidade ciclano = new ContaEntidade();

        ciclano.setCodigo(conta02.codigo());
        ciclano.setCliente(conta02.cliente());

        contas.add(fulano);
        contas.add(ciclano);
    }
    @Autowired
    ContaMapper contaMapper;




    public TransacaoResponseDTO criarTransacao(TransacaoRequestDTO requestDTO) {
        // Encontrar contas de origem e destino usando os códigos fornecidos
        ContaEntidade origem = null;
        ContaEntidade destino = null;

        for (ContaEntidade conta : contas) {
            if (conta.getCodigo().equals(requestDTO.origem())) {
                origem = conta;
            } else if (conta.getCodigo().equals(requestDTO.destino())) {
                destino = conta;
            }
        }

        // Criar a transação sem validações
        TransacaoEntidade transacao = new TransacaoEntidade();
        transacao.setOrigem(origem);
        transacao.setDestino(destino);
        transacao.setValor(requestDTO.valor());

        // Converter as contas para DTOs
        ContaDTO origemDTO = contaMapper.toDto(origem);
        ContaDTO destinoDTO = contaMapper.toDto(destino);

        // Retornar o TransacaoResponseDTO
        return new TransacaoResponseDTO(origemDTO, destinoDTO, transacao.getValor());
    }
}