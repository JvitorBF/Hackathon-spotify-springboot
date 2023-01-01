package com.stefanini.spotify.service;

import com.stefanini.spotify.exception.MusicaNotFoundException;
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

    public Musica findById(Long id) throws MusicaNotFoundException {
        return musicaRepository.findById(id).orElseThrow(() -> new MusicaNotFoundException(id));
    }

    public Musica save(Musica musica) {
        return musicaRepository.save(musica);
    }

    public void delete(Musica musica) {musicaRepository.delete(musica);}

}
