package com.stefanini.spotify.service;

import com.stefanini.spotify.exception.ArtistaNotFoundException;
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

    public Artista findById(Long id) throws ArtistaNotFoundException {
        return artistaRepository.findById(id).orElseThrow(() -> new ArtistaNotFoundException(id));
    }

    public Artista save(Artista artista) {
        return artistaRepository.save(artista);
    }
}
