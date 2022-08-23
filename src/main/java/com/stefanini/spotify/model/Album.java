package com.stefanini.spotify.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_album;

    @Column(nullable = false)
    private String data;

    @OneToMany(mappedBy = "album")
    private List<Musica> musicas;

    public Album(Long id, String nome_album, String data) {
        this.id = id;
        this.nome_album = nome_album;
        this.data = data;
    }
}
