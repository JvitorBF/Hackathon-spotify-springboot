package com.stefanini.spotify.dto;

public class MusicaDto {
    private String nome_musica;

    private String duracao;
    private Long musica;
    private Long artista;
    private Long playlist;
    private Long album;

    public MusicaDto() {
    }

    public MusicaDto(String nome_musica, String duracao, Long musica, Long artista, Long playlist) {
        this.nome_musica = nome_musica;
        this.duracao = duracao;
        this.musica = musica;
        this.artista = artista;
        this.playlist = playlist;
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
    public Long getMusica() {
        return musica;
    }
    public void setMusica(Long musica) {
        this.musica = musica;
    }
    public Long getArtista() {
        return artista;
    }
    public void setArtista(Long artista) {
        this.artista = artista;
    }
    public Long getPlaylist() {
        return playlist;
    }
    public void setPlaylist(Long playlist) {
        this.playlist = playlist;
    }
    public Long getAlbum() {
        return album;
    }
    public void setAlbum(Long album) {
        this.album = album;
    }
}
