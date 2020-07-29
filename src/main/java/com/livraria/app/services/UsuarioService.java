package com.livraria.app.services;

import com.livraria.app.entities.Usuario;
import com.livraria.app.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario loginUsuario(Usuario usuario) {
        Optional<Usuario> obj = usuarioRepository.findByLoginLike(usuario.getLogin());
        return obj.get();
    }
}
