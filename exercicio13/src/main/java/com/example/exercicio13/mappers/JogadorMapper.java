package com.example.exercicio13.mappers;

import com.example.exercicio13.dtos.JogadorResponseDto;
import com.example.exercicio13.models.JogadorEntidade;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDto toDto(JogadorEntidade jogador){
        return new JogadorResponseDto(
                jogador.getNome(),
                jogador.getApelido(),
                jogador.getHabilidade()
        ) ;
    }
}
