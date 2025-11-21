package br.unitins.topicos1.sga.dto;

import java.time.LocalDateTime;
import java.util.List;

import br.unitins.topicos1.sga.model.Pedido;

public record PedidoResponseDTO(
        Long id,
        LocalDateTime data,
        Double total,
        UsuarioResponseDTO usuario,
        List<ItemPedidoResponseDTO> itensPedido) {

    public static PedidoResponseDTO valueOf(Pedido pedido) {
        return new PedidoResponseDTO(
                pedido.getId(),
                pedido.getData(),
                pedido.getTotal(),
                UsuarioResponseDTO.valueOf(pedido.getUsuario()),
                pedido.getItensPedido().stream().map(ip -> ItemPedidoResponseDTO.valueOf(ip)).toList());
    }
}