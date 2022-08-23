package com.stefanini.spotify.service;

import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.repository.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {
    private final MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> findAllMusica() {
        return musicaRepository.findAll();
    }

      /* Colocar exceptions
    public Musica findById(Long id) {
        return musicaRepository.findById(id);
    }*/

    public Musica save(Musica musica) {
        return musicaRepository.save(musica);
    }
}
