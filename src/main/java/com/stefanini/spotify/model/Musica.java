package com.stefanini.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_musica;

    @Column(nullable = false)
    private String duracao;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "artista_id")
    private Artista artista;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "album_id")
    private Album album;

    public Musica(Long id, String nome_musica, String duracao, Artista artista, Playlist playlist, Album album) {
        this.id = id;
        this.nome_musica = nome_musica;
        this.duracao = duracao;
        this.artista = artista;
        this.playlist = playlist;
        this.album = album;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome_musica() {return nome_musica;}
    public void setNome_musica(String nome_musica) {this.nome_musica = nome_musica;}
    public String getDuracao() {return duracao;}
    public void setDuracao(String duracao) {this.duracao = duracao;}
    public Album getAlbum() {return album;}
    public void setAlbum(Album album) {this.album = album;}
    public Playlist getPlaylist() {return playlist;}
    public void setPlaylist(Playlist playlist) {this.playlist = playlist;}
    public Artista getArtista() {return artista;}
    public void setArtista(Artista artista) {this.artista = artista;    }

}
