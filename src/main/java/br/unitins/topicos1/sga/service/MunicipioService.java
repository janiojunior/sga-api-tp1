package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.MunicipioDTO;
import br.unitins.topicos1.sga.dto.MunicipioDTOResponse;

public interface MunicipioService {
    List<MunicipioDTOResponse> findAll();
    List<MunicipioDTOResponse> findByNome(String nome);
    MunicipioDTOResponse findById(Long id);
    MunicipioDTOResponse create(MunicipioDTO dto);
    void update(Long id, MunicipioDTO dto);
    void delete(Long id);
}
