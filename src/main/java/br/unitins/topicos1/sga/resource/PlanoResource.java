package br.unitins.topicos1.sga.resource;

import java.net.URI;

import br.unitins.topicos1.sga.dto.PlanoDTO;
import br.unitins.topicos1.sga.dto.PlanoResponseDTO;
import br.unitins.topicos1.sga.service.PlanoService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/planos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanoResource {

    @Inject
    PlanoService service;

    @GET
    public Response buscarTodos() {

        return Response.ok(service.getAll()).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    public Response buscarPorNome(@PathParam("nome") String nome) {
        return Response.ok(service.findByNome(nome)).build();
    }

    @GET
    @Path("/{id: \\d+}")
    public Response buscarPorId(@PathParam("id") Long id) {
        return Response.ok(service.findById(id)).build();
    }

    @POST
    public Response incluir(@Valid PlanoDTO dto, @Context UriInfo uriInfo) {
        PlanoResponseDTO created = service.create(dto);
        URI location = UriBuilder.fromResource(PlanoResource.class)
                .path(PlanoResource.class, "buscarPorId")
                .build(created.id());
        return Response.created(location).entity(created).build();
    }

    @PUT
    @Path("/{id: \\d+}")
    public Response alterar(@Valid PlanoDTO dto, @PathParam("id") Long id) {
        PlanoResponseDTO updated = service.update(id, dto);
        return Response.ok(updated).build(); // ou 204 sem corpo, se preferir
    }

    @DELETE
    @Path("/{id: \\d+}")
    public Response apagar(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }

    @GET
    @Path("/count")
    public long total() {
        return service.count();
    }

}
