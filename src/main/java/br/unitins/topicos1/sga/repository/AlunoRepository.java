package br.unitins.topicos1.sga.repository;

import java.util.List;

import br.unitins.topicos1.sga.model.Aluno;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlunoRepository implements PanacheRepository<Aluno> {

    public List<Aluno> findByNome(String nome) {
        return find("SELECT a FROM Aluno a WHERE a.nome LIKE ?1 ", "%"+nome+"%").list();
    }
    
}
