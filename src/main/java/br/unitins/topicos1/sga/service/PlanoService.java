package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.PlanoDTO;
import br.unitins.topicos1.sga.dto.PlanoResponseDTO;


public interface PlanoService {

        // recursos basicos
        List<PlanoResponseDTO> getAll();

        PlanoResponseDTO findById(Long id);
    
        PlanoResponseDTO create(PlanoDTO dto);
    
        PlanoResponseDTO update(Long id, PlanoDTO dto);
    
        void delete(Long id);
    
        // recursos extras
    
        List<PlanoResponseDTO> findByNome(String nome);
    
        long count();

}