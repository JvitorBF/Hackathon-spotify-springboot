package com.stefanini.spotify.repository;

import com.stefanini.spotify.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}