package com.stefanini.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(mappedBy = "musicas")
    private List<Artista> artista;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public Musica(Long id, String nome_musica, String duracao, List<Artista> artista,Album album) {
        this.id = id;
        this.nome_musica = nome_musica;
        this.duracao = duracao;
        this.artista = artista;

        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }


    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
