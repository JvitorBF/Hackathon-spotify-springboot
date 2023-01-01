package com.stefanini.spotify.repository;

import com.stefanini.spotify.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}