package br.unitins.topicos1.sga.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EstadoDTO(
    @NotBlank(message = "O nome deve ser informado.")
    String nome,

    @Size(min = 2, message = "A sigla não pode ter menos de 2 letras.")
    @Size(max = 2, message = "A sigla não pode ter mais de  duas letras.")
    @NotNull(message = "A sigla deve ser informada.")
    String sigla,
    
    @NotNull(message="A regiao deve ser informada.")
    Long idRegiao
) {   
}
