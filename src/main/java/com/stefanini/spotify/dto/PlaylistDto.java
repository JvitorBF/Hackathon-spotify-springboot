package com.stefanini.spotify.dto;

public class PlaylistDto {
    private Long id;
    private String nome_playlist;
    private String descricao;
    private Long usuario;

    public PlaylistDto() {
    }

    public PlaylistDto(Long id, String nome_playlist, String descricao, Long usuario) {
        this.id = id;
        this.nome_playlist = nome_playlist;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }
}
