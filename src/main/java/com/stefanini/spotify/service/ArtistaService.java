package com.stefanini.spotify.service;

import com.stefanini.spotify.model.Artista;
import com.stefanini.spotify.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> findAllArtista() {
        return artistaRepository.findAll();
    }

    /*
    public Artista findById(Long id) {
        return artistaRepository.findById(id);
    }*/

    public Artista save(Artista artista) {
        return artistaRepository.save(artista);
    }
}
