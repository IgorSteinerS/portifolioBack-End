package com.example.exercicio13.dtos;

import jakarta.validation.constraints.NotBlank;

public record JogadorRequestDto(
        @NotBlank String nome,
        @NotBlank String apelido
        ) {
}
