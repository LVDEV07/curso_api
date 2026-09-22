package com.curso_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CursoRequestDTO(

        @NotBlank(message = "Nome do curso obrigatório")
        String nome,
        @NotBlank(message = "Descrição é obrigatória")
        String descricao,

        @NotNull(message = "Carga horaria minima é 1 hota")
        Integer cargaHoraria,

        @NotNull(message = "Instrutor é obrigatório")
        Long instrutorId
) {
}
