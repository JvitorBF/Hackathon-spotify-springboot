package com.stefanini.spotify.controller;

import com.stefanini.spotify.dto.UsuarioDto;
import com.stefanini.spotify.exception.UsuarioNotFoundException;
import com.stefanini.spotify.mapper.UsuarioDtoService;
import com.stefanini.spotify.model.Usuario;
import com.stefanini.spotify.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final UsuarioDtoService usuarioDtoService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService, UsuarioDtoService usuarioDtoService) {
        this.usuarioService = usuarioService;
        this.usuarioDtoService = usuarioDtoService;
    }

    // Funcionando
    @RequestMapping(path = "/usuario")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAllUsuario();
    }

    // Funcionando
    @PostMapping(value = "/usuario")
    public String saveUsuario(@RequestBody UsuarioDto usuario) {
        Usuario newUsuario = usuarioDtoService.mapUsuario(usuario);
        usuarioService.save(newUsuario);
        return usuario.getNome_usuario() + ", salvo com sucesso!";
    }

    // Funcionando
    @PutMapping(value = "/usuario/{id}")
    public String updateUsuario(@PathVariable("id") Long usuarioId, @RequestBody UsuarioDto usuario) throws UsuarioNotFoundException {
        Usuario repo = usuarioService.findById(usuarioId);
        repo = usuarioDtoService.mapUsuario(usuario);
        repo.setId(usuarioId);
        usuarioService.save(repo);
        return "Usuário atualizado com sucesso!";
    }

    // Funcionando
    @DeleteMapping(value = "/usuario/{id}")
    public String deleteUsuarioById(@PathVariable("id") Long usuarioId) throws UsuarioNotFoundException {
        Usuario usuario = usuarioService.findById(usuarioId);
        usuarioService.delete(usuario);
        return "Usuário deletado com sucesso!";
    }
}
