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
    @JoinTable(name = "artista_musica",
            joinColumns = @JoinColumn(name = "artista_id"),
            inverseJoinColumns = @JoinColumn(name = "musica_id"))
    private List<Musica> musicas;

    public Artista(Long id, String nome_artista, List<Musica> musicas) {
        this.id = id;
        this.nome_artista = nome_artista;
        this.musicas = musicas;
    }
}
