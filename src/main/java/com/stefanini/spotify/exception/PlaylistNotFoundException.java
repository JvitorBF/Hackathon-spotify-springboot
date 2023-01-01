package com.stefanini.spotify.exception;

public class PlaylistNotFoundException extends Exception {
    public PlaylistNotFoundException(Long id) {
        super("Playist não ecnontrada com id: " + id);
    }
}
