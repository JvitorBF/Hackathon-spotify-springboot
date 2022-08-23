package com.stefanini.spotify.dto;

public class AlbumDto {

    private String nome_album;

    private String data;

    public AlbumDto() {
    }

    public AlbumDto(String nome_album, String data) {
        this.nome_album = nome_album;
        this.data = data;
    }

    public String getNome_album() {return nome_album;}

    public void setNome_album(String nome_album) {this.nome_album = nome_album;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}
}
