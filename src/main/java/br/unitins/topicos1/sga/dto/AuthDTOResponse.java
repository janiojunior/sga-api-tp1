package br.unitins.topicos1.sga.dto;

import br.unitins.topicos1.sga.model.Usuario;

public record AuthDTOResponse(
    Long id,
    String login,
    String senha
) {  
    
    public static AuthDTOResponse valueOf(Usuario usuario) {
        return new AuthDTOResponse(
            usuario.getId(),
            usuario.getLogin(),
            usuario.getSenha()
        );
    }
}