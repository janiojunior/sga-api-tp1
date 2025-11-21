package br.unitins.topicos1.sga.dto;

import br.unitins.topicos1.sga.model.ItemPedido;

public record ItemPedidoResponseDTO(
        Long id,
        Integer quantidade,
        Double preco,
        PlanoResponseDTO plano) {

    public static ItemPedidoResponseDTO valueOf(ItemPedido itemPedido) {
        return new ItemPedidoResponseDTO(
                itemPedido.getId(),
                itemPedido.getQuantidade(),
                itemPedido.getPreco(),
                PlanoResponseDTO.valueOf(itemPedido.getPlano()));
    }
}