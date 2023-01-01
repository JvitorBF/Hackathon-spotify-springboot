package com.stefanini.spotify.mapper;

import com.stefanini.spotify.dto.ArtistaDto;
import com.stefanini.spotify.model.Artista;
import org.springframework.stereotype.Service;

@Service
public class ArtistaDtoService {
    // Transformar DTO em Model?
    public Artista mapArtista(ArtistaDto artista) {
        Artista newArtista = new Artista(null,
                artista.getNome_artista(),
                null);
        return newArtista;
    }
}
