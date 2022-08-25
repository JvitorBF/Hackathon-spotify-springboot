package com.stefanini.spotify.dto;

public class PlaylistDto {
    private String nome_playlist;
    private String descricao;
    public PlaylistDto() {
    }
    public PlaylistDto(String nome_playlist, String descricao) {
        this.nome_playlist = nome_playlist;
        this.descricao = descricao;
    }
    public String getNome_playlist() {return nome_playlist;}
    public void setNome_playlist(String nome_playlist) {this.nome_playlist = nome_playlist;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}
