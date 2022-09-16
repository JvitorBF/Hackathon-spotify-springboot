package com.stefanini.spotify.controller;

import com.stefanini.spotify.dto.MusicaDto;
import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.exception.MusicaNotFoundException;
import com.stefanini.spotify.mapper.MusicaDtoService;
import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicaController {

    private final MusicaService musicaService;
    private final MusicaDtoService musicaDtoService;

    @Autowired
    public MusicaController(MusicaService musicaService, MusicaDtoService musicaDtoService) {
        this.musicaService = musicaService;
        this.musicaDtoService = musicaDtoService;
    }

    @RequestMapping(path = "/musica")
    public List<Musica> getAllMusicas() {
        return musicaService.findAllMusica();
    }

    @PostMapping(value = "/musica")
    public String saveMusica(@RequestBody MusicaDto musica) throws AlbumNotFoundException {
        Musica newMusica = musicaDtoService.mapMusica(musica);
        musicaService.save(newMusica);
        return newMusica.getNome_musica() + ", salva com sucesso!";
    }

    @PutMapping(value = "/musica/{id}")
    public String updateMusica(@PathVariable("id") Long musicaId, @RequestBody MusicaDto musica) throws MusicaNotFoundException, AlbumNotFoundException {
        Musica repo = musicaService.findById(musicaId);
        repo = musicaDtoService.mapMusica(musica);
        repo.setId(musicaId);
        musicaService.save(repo);
        return "Música atualizada com sucesso!";
    }

    // Funcionando
    @DeleteMapping(value = "/musica/{id}")
    public String deleteMusicaById(@PathVariable("id") Long musicaId) throws MusicaNotFoundException {
        Musica musica = musicaService.findById(musicaId);
        musicaService.delete(musica);
        return "Música deletada com sucesso!";
    }
}
