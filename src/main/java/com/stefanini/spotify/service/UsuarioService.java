package com.stefanini.spotify.service;

import com.stefanini.spotify.exception.UsuarioNotFoundException;
import com.stefanini.spotify.model.Usuario;
import com.stefanini.spotify.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAllUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) throws UsuarioNotFoundException {
        return usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
