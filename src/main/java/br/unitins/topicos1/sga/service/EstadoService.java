package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.EstadoDTO;
import br.unitins.topicos1.sga.dto.EstadoDTOResponse;
import jakarta.validation.Valid;

public interface EstadoService {
    List<EstadoDTOResponse> findAll();
    List<EstadoDTOResponse> findByNome(String nome);
    EstadoDTOResponse findById(Long id);
    EstadoDTOResponse create(@Valid EstadoDTO dto);
    void update(Long id, @Valid EstadoDTO dto);
    void delete(Long id);
}
