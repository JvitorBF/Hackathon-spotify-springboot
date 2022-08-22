package com.stefanini.spotify.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_playlist;

    @Column(nullable = false)
    private String descricao;

    public Playlist(Long id, String nome_playlist, String descricao) {
        this.id = id;
        this.nome_playlist = nome_playlist;
        this.descricao = descricao;
    }
}
