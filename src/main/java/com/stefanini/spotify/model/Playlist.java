package com.stefanini.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "playlist")
    private List<Musica> musicas;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    public Playlist(Long id, String nome_playlist, String descricao, List<Musica> musicas, Usuario usuario) {
        this.id = id;
        this.nome_playlist = nome_playlist;
        this.descricao = descricao;
        this.musicas = musicas;
        this.usuario = usuario;
    }
    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}
}
