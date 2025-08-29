package br.unitins.topicos1.sga.resource;

import java.util.List;

import br.unitins.topicos1.sga.model.Aluno;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/alunos")
public class AlunoResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> getAll() {
        return Aluno.listAll();
    }
}
