package com.stefanini.spotify.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;
@NoArgsConstructor
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome_usuario;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String aniversario;
    @Column(nullable = false)
    private String pais;
    @OneToMany(mappedBy = "usuario")
    private List<Playlist> playlist;

    public Usuario(Long id, String nome_usuario, String email, String aniversario, String pais, List<Playlist> playlist) {
        this.id = id;
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.aniversario = aniversario;
        this.pais = pais;
        this.playlist = playlist;
    }
}
