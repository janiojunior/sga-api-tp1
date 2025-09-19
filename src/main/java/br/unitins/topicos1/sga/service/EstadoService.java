package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.EstadoDTO;
import br.unitins.topicos1.sga.dto.EstadoDTOResponse;

public interface EstadoService {
    List<EstadoDTOResponse> findAll();
    List<EstadoDTOResponse> findByNome(String nome);
    EstadoDTOResponse findById(Long id);
    EstadoDTOResponse create(EstadoDTO dto);
    void update(Long id, EstadoDTO dto);
    void delete(Long id);
}
