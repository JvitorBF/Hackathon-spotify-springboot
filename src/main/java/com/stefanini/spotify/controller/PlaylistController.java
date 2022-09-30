package com.stefanini.spotify.controller;


import com.stefanini.spotify.dto.PlaylistDto;
import com.stefanini.spotify.exception.MusicaNotFoundException;
import com.stefanini.spotify.exception.PlaylistNotFoundException;
import com.stefanini.spotify.exception.UsuarioNotFoundException;
import com.stefanini.spotify.mapper.PlaylistDtoService;
import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.model.Playlist;
import com.stefanini.spotify.service.MusicaService;
import com.stefanini.spotify.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaylistController {
    private final PlaylistService playlistService;
    private final PlaylistDtoService playlistDtoService;
    private final MusicaService musicaService;

    @Autowired
    public PlaylistController(PlaylistService playlistService, PlaylistDtoService playlistDtoService, MusicaService musicaService) {
        this.playlistService = playlistService;
        this.playlistDtoService = playlistDtoService;
        this.musicaService = musicaService;
    }

    @RequestMapping(path = "/playlist")
    public List<Playlist> getAllPlaylist() {
        return playlistService.findAllPlaylist();
    }

    //@PostMapping
    @PostMapping(value = "/playlist")
    public String savePlaylist(@RequestBody PlaylistDto playlist) throws UsuarioNotFoundException {
        Playlist newPlaylist = playlistDtoService.mapPlaylist(playlist);
        playlistService.save(newPlaylist);
        return playlist.getNome_playlist() + ", salva com sucesso!";
    }

    @PutMapping(value = "/playlist/{id}")
    public String updatePlaylist(@PathVariable("id") Long playlistId, @RequestBody PlaylistDto playlist) throws PlaylistNotFoundException, UsuarioNotFoundException {
        Playlist repo = playlistService.findById(playlistId);
        List<Musica> musicas = repo.getMusicas();
        repo = playlistDtoService.mapPlaylist(playlist);
        repo.setId(playlistId);
        repo.setMusicas(musicas);
        playlistService.save(repo);
        return "Playlist atualizada";
    }

    @PutMapping(value = "/playlist")
    public String updatePlaylist(@RequestParam Long playlistId, @RequestParam Long musicaId) throws PlaylistNotFoundException, MusicaNotFoundException {
        Musica musicaRepo = musicaService.findById(musicaId);
        Playlist playlistRepo = playlistService.findById(playlistId);
        playlistRepo.addMusica(musicaRepo);
        playlistService.save(playlistRepo);
        return "Playlist atualizada com nova música!";
    }

        //@DeleteMapping
    @DeleteMapping(value = "/playlist/{id}")
    public String deletePlaylistById(@PathVariable("id") Long playlistId) throws PlaylistNotFoundException {
        Playlist playlist = playlistService.findById(playlistId);
        playlistService.delete(playlist);
        return "Playlist deletado com sucesso!";
    }
}
