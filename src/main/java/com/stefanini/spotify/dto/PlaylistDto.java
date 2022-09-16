package com.stefanini.spotify.dto;

public class PlaylistDto {
    private Long tag;
    private String nome_playlist;
    private String descricao;
    private Long musica;
    private Long usuario;

    public PlaylistDto() {
    }

    public PlaylistDto(Long tag, String nome_playlist, String descricao, Long musica, Long usuario) {
        this.tag = tag;
        this.nome_playlist = nome_playlist;
        this.descricao = descricao;
        this.musica = musica;
        this.usuario = usuario;
    }

    public Long getTag() {
        return tag;
    }

    public void setTag(Long tag) {
        this.tag = tag;
    }

    public String getNome_playlist() {
        return nome_playlist;
    }

    public void setNome_playlist(String nome_playlist) {
        this.nome_playlist = nome_playlist;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getMusica() {
        return musica;
    }

    public void setMusica(Long musica) {
        this.musica = musica;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }
}
