package br.unitins.topicos1.sga.dto;

import br.unitins.topicos1.sga.model.Estado;
import br.unitins.topicos1.sga.model.Regiao;

public record EstadoDTOResponse(
    Long id,
    String nome,
    String sigla,
    Regiao regiao
) {  
    
    public static EstadoDTOResponse valueOf(Estado estado) {
        return new EstadoDTOResponse(
            estado.getId(),
            estado.getNome(),
            estado.getSigla(),
            estado.getRegiao()
        );
    }
}