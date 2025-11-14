package br.unitins.topicos1.sga.service;

import br.unitins.topicos1.sga.model.Perfil;

public interface JwtService {

    public String generateJwt(String usuario, Perfil perfil);
    
}
