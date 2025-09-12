package br.unitins.topicos1.sga.dto;

import java.time.LocalDate;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonFormat;

public record AlunoDTO(
    String cpf,
    String nome,
    Long idMunicipioNaturalidade,
    @Schema(type = SchemaType.STRING, example = "25/12/2000")
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataNascimento,
    Double peso) {
    
}
