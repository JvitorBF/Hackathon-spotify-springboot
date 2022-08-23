package com.stefanini.spotify.dto;

public class ArtistaDto {

    private String nome_artista;

    public ArtistaDto() {
    }

    public ArtistaDto(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public String getNome_artista() {return nome_artista;}

    public void setNome_artista(String nome_artista) {this.nome_artista = nome_artista;}
}
