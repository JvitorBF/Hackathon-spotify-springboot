package com.stefanini.spotify.service;

import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.model.Album;
import com.stefanini.spotify.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> findAllAlbum() {
        return albumRepository.findAll();
    }

    public Album findById(Long id) throws AlbumNotFoundException {
        return albumRepository.findById(id).orElseThrow(() -> new AlbumNotFoundException(id));
    }

    public Album save(Album album) {
        return albumRepository.save(album);
    }

}
