package com.stefanini.spotify.dto;

import com.stefanini.spotify.model.Artista;
import java.util.List;

public class MusicaDto {
    private String nome_musica;
    private String duracao;
    private List<Artista> artista;
    private Long album;

    public MusicaDto() {
    }

    public MusicaDto(String nome_musica, String duracao, List<Artista> artista, Long album) {
        this.nome_musica = nome_musica;
        this.duracao = duracao;
        this.artista = artista;
        this.album = album;
    }

    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }

    public Long getAlbum() {
        return album;
    }

    public void setAlbum(Long album) {
        this.album = album;
    }
}
