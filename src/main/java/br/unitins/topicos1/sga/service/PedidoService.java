package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.PedidoDTO;
import br.unitins.topicos1.sga.dto.PedidoResponseDTO;


public interface PedidoService {

        List<PedidoResponseDTO> getAll();

        PedidoResponseDTO findById(Long id);

        List<PedidoResponseDTO> findByUsuario(String login);
    
        PedidoResponseDTO create(PedidoDTO dto, String login);
    
}