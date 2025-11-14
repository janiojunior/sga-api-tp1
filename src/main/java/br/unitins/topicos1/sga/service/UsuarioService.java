package br.unitins.topicos1.sga.service;

import java.util.List;

import br.unitins.topicos1.sga.model.Usuario;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findByLogin(String login);
    Usuario findByLoginAndSenha(String login, String senha);
    Usuario findById(Long id);
}
