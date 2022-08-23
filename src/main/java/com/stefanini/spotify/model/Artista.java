package com.stefanini.spotify.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome_artista;

    @OneToMany(mappedBy = "artista")
    @ToString.Exclude
    private List<Musica> musicas;


    public Artista(Long id, String nome_artista) {
        this.id = id;
        this.nome_artista = nome_artista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Artista artista = (Artista) o;
        return id != null && Objects.equals(id, artista.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
