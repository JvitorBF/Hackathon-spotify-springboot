package com.stefanini.spotify.dto;

public class ArtistaDto {

    private String nome_artista;

    private Long musica;

    public ArtistaDto() {
    }

    public ArtistaDto(String nome_artista, Long musica) {
        this.nome_artista = nome_artista;
        this.musica = musica;
    }

    public String getNome_artista() {return nome_artista;}

    public void setNome_artista(String nome_artista) {this.nome_artista = nome_artista;}

    public Long getMusica() {
        return musica;
    }
    public void setMusica(Long musica) {
        this.musica = musica;
    }
}
