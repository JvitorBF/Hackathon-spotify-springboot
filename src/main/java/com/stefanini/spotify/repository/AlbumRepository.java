package com.stefanini.spotify.repository;

import com.stefanini.spotify.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}