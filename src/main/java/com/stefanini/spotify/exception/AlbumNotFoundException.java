package com.stefanini.spotify.exception;

public class AlbumNotFoundException extends Exception{
    public AlbumNotFoundException(Long id) {
        super("Album não encontrado com o id: " + id);
    }
}
