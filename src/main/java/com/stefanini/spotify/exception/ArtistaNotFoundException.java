package com.stefanini.spotify.exception;

public class ArtistaNotFoundException extends Exception {
    public ArtistaNotFoundException(Long id) {
        super("Artista não encontrado com id: " + id);
    }
}
