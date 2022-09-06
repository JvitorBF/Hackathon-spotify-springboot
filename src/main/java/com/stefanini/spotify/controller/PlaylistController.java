package com.stefanini.spotify.controller;


import com.stefanini.spotify.dto.PlaylistDto;
import com.stefanini.spotify.exception.PlaylistNotFoundException;
import com.stefanini.spotify.exception.UsuarioNotFoundException;
import com.stefanini.spotify.mapper.PlaylistDtoService;
import com.stefanini.spotify.model.Playlist;
import com.stefanini.spotify.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PlaylistController {
    private final PlaylistService playlistService;
    private final PlaylistDtoService playlistDtoService;

    @Autowired
    public PlaylistController(PlaylistService playlistService, PlaylistDtoService playlistDtoService) {
        this.playlistService = playlistService;
        this.playlistDtoService = playlistDtoService;
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
    //@PutMapping
    @PutMapping(value = "/playlist/{id}")
    public String updatePlaylist(@PathVariable("id") Long playlistId, @RequestBody PlaylistDto playlist) throws PlaylistNotFoundException, UsuarioNotFoundException {
        Playlist repo = playlistService.findById(playlistId);
        repo = playlistDtoService.mapPlaylist(playlist);
        repo.setId(playlistId);
        playlistService.save(repo);
        return "Playlist atualizada com sucesso!";
    }

    //@DeleteMapping
    @DeleteMapping(value = "/playlist/{id}")
    public String deletePlaylistById(@PathVariable("id") Long playlistId) throws PlaylistNotFoundException {
        Playlist playlist = playlistService.findById(playlistId);
        playlistService.delete(playlist);
        return "Playlist deletado com sucesso!";
    }
}
