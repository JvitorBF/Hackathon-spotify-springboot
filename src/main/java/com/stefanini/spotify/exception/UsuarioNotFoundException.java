package com.stefanini.spotify.exception;

public class UsuarioNotFoundException extends Exception {
    public UsuarioNotFoundException(Long id) {
        super("Usuário não encontrado com id:" + id);
    }
}
