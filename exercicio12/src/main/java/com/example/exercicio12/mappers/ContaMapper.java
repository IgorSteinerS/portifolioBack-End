package com.example.exercicio12.mappers;

import com.example.exercicio12.dtos.ContaDTO;
import com.example.exercicio12.models.ContaEntidade;
import org.springframework.stereotype.Component;

@Component
public class ContaMapper {

    public ContaDTO toDto(ContaEntidade conta){
        return new ContaDTO(
                conta.getCodigo(),
                conta.getCliente()
        );
    }
}
