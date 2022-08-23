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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Musica(Long id, String nome_musica, String duracao) {
        this.id = id;
        this.nome_musica = nome_musica;
        this.duracao = duracao;
    }
}
