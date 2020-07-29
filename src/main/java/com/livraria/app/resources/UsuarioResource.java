package com.livraria.app.resources;

import com.livraria.app.entities.Usuario;
import com.livraria.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody Usuario usuario){
        usuario = usuarioService.cadastrarUsuario(usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<Usuario> loginUsuario(@RequestBody Usuario usuario){
        Optional<Usuario> obj = Optional.ofNullable(usuarioService.loginUsuario(usuario));
        if (obj.get().getLogin().equals(usuario.getLogin()) && obj.get().getSenha().equals(usuario.getSenha())){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
