package br.unitins.topicos1.sga.dto;

import br.unitins.topicos1.sga.model.Municipio;

public record MunicipioDTOResponse(
    Long id,
    String nome,
    EstadoDTOResponse estado) {  
    
    public static MunicipioDTOResponse valueOf(Municipio municipio) {
        return new MunicipioDTOResponse(
            municipio.getId(),
            municipio.getNome(),
            EstadoDTOResponse.valueOf(municipio.getEstado())
        );
    }
}