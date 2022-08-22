package com.stefanini.spotify.model;

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

    public Musica(Long id, String nome_musica, String duracao) {
        this.id = id;
        this.nome_musica = nome_musica;
        this.duracao = duracao;
    }
}
