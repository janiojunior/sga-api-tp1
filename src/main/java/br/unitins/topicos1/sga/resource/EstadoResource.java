package br.unitins.topicos1.sga.resource;

import br.unitins.topicos1.sga.dto.EstadoDTO;
import br.unitins.topicos1.sga.service.EstadoService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/estados")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstadoResource {

    @Inject
    EstadoService service;

    @GET
    @RolesAllowed({"ADM","USER"})
    public Response buscarTodos() {
        return Response.ok(service.findAll()).build();
    }

    @GET
    @Path("/find/{nome}")
    @RolesAllowed("USER")
    public Response buscarPorNome(String nome) {
        return Response.ok(service.findByNome(nome)).build();
    }

    @POST
    public Response incluir(EstadoDTO dto) {
        return Response.status(Status.CREATED).entity(service.create(dto)).build();
    }

    @PUT
    @Path("/{id}")
    public Response alterar(Long id, EstadoDTO dto) {
        service.update(id, dto);
        return Response.noContent().build();
    }

    @DELETE
    @Path("/{id}")
    public Response apagar(Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
