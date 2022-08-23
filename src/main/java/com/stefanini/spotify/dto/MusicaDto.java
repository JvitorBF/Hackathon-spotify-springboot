package com.stefanini.spotify.dto;

public class MusicaDto {
    private String nome_musica;

    private String duracao;

    public MusicaDto() {
    }

    public MusicaDto(String nome_musica, String duracao) {
        this.nome_musica = nome_musica;
        this.duracao = duracao;
    }

    public String getNome_musica() {return nome_musica;}

    public void setNome_musica(String nome_musica) {this.nome_musica = nome_musica;}

    public String getDuracao() {return duracao;}

    public void setDuracao(String duracao) {this.duracao = duracao;}
}
