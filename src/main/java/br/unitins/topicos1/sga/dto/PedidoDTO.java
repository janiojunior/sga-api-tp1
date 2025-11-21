package br.unitins.topicos1.sga.dto;

import java.util.List;

public record PedidoDTO(
    Double total,
    List<ItemPedidoDTO> itensPedido
) { }