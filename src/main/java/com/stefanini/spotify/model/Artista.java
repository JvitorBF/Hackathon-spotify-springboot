package com.stefanini.spotify.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_artista;

    @ManyToMany
    @JoinTable(name = "artista_album",
            joinColumns = @JoinColumn(name = "artista_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id"))
    private List<Album> albuns;

    public Artista(Long id, String nome_artista, List<Album> albuns) {
        this.id = id;
        this.nome_artista = nome_artista;
        this.albuns = albuns;
    }

    public void addAlbum(Album album) {
        this.albuns.add(album);
    }
}
