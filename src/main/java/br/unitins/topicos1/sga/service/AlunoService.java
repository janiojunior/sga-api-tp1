package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.AlunoDTO;
import br.unitins.topicos1.sga.model.Aluno;

public interface AlunoService {
    List<Aluno> findAll();
    List<Aluno> findByNome(String nome);
    Aluno findById(Long id);
    Aluno create(AlunoDTO dto);
    void update(Long id, AlunoDTO dto);
    void delete(Long id);
}
