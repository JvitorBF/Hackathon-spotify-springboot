package com.stefanini.spotify.mapper;

import com.stefanini.spotify.dto.UsuarioDto;
import com.stefanini.spotify.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDtoService {

    public Usuario mapUsuario(UsuarioDto usuario) {
        Usuario newUsuario = new Usuario(null, usuario.getNome_usuario(),
                usuario.getEmail(),
                usuario.getAniversario(),
                usuario.getPais(),
                null);
        return newUsuario;
    }
}
