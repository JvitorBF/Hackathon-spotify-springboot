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

    @OneToMany(mappedBy = "artista")
    private List<Musica> musicas;


    public Artista(Long id, String nome_artista) {
        this.id = id;
        this.nome_artista = nome_artista;
    }
}
