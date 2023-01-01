package com.stefanini.spotify.dto;

public class MusicaDto {
    private String nome_musica;
    private String duracao;
    private Long album;

    public MusicaDto() {
    }

    public MusicaDto(String nome_musica, String duracao, Long album) {
        this.nome_musica = nome_musica;
        this.duracao = duracao;
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

    public Long getAlbum() {
        return album;
    }

    public void setAlbum(Long album) {
        this.album = album;
    }
}
