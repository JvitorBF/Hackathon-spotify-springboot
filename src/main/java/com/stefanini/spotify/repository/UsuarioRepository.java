package com.stefanini.spotify.repository;

import com.stefanini.spotify.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}