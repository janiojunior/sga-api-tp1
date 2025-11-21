package br.unitins.topicos1.sga.dto;

public record ItemPedidoDTO(
    Integer quantidade,
    Double preco,
    Long idPlano
) { }