package com.stefanini.spotify.dto;

public class AlbumDto {

    private String nome_album;

    private String data;
    private Long musica;

    public AlbumDto() {
    }

    public AlbumDto(String nome_album, String data, Long musica) {
        this.nome_album = nome_album;
        this.data = data;
        this.musica = musica;
    }

    public String getNome_album() {return nome_album;}

    public void setNome_album(String nome_album) {this.nome_album = nome_album;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public Long getMusica() {
        return musica;
    }

    public void setMusica(Long musica) {
        this.musica = musica;
    }
}
