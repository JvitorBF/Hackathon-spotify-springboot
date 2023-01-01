package com.stefanini.spotify.mapper;

import com.stefanini.spotify.dto.ArtistaDto;
import com.stefanini.spotify.model.Artista;
import org.springframework.stereotype.Service;

@Service
public class ArtistaDtoService {
    // Transformar DTO em Model?
    public Artista mapArtista(ArtistaDto artista) {
<<<<<<< HEAD
        Artista newArtista = new Artista(null,
                artista.getNome_artista(),
                null);
=======
        Artista newArtista = new Artista(null, artista.getNome_artista(), null);
>>>>>>> 5c2bb1fc1b015806350a840649b44832ca77a63d
        return newArtista;
    }
}
