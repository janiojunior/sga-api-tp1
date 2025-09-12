package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.dto.AlunoDTO;
import br.unitins.topicos1.sga.model.Aluno;
import br.unitins.topicos1.sga.model.Municipio;
import br.unitins.topicos1.sga.repository.AlunoRepository;
import br.unitins.topicos1.sga.repository.MunicipioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AlunoServiceImpl implements AlunoService {

    @Inject
    AlunoRepository repository;

    @Inject
    MunicipioRepository repositoryMunicipio;

    @Override
    public List<Aluno> findAll() {
        return repository.listAll();
    }

    @Override
    public List<Aluno> findByNome(String nome) {
        return repository.findByNome(nome);
    }

    @Override
    public Aluno findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Aluno create(AlunoDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setCpf(dto.cpf());
        aluno.setNome(dto.nome());
        aluno.setDataNascimento(dto.dataNascimento());
        aluno.setPeso(dto.peso());
        // buscando o municipio pelo id
        Municipio natualidade = repositoryMunicipio.findById(dto.idMunicipioNaturalidade());
        aluno.setNaturalidade(natualidade);

        repository.persist(aluno);

        return aluno;
    }

    @Override
    @Transactional
    public void update(Long id, AlunoDTO dto) {
        Aluno aluno = repository.findById(id);
        aluno.setCpf(dto.cpf());
        aluno.setNome(dto.nome());
        aluno.setDataNascimento(dto.dataNascimento());
        aluno.setPeso(dto.peso());
        // buscando o municipio pelo id
        Municipio natualidade = repositoryMunicipio.findById(dto.idMunicipioNaturalidade());
        aluno.setNaturalidade(natualidade);
    }

    @Override
    @Transactional
    public void delete(Long id) {
       repository.deleteById(id);
    }
    
}
