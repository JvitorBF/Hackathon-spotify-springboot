package com.stefanini.spotify.service;

import com.stefanini.spotify.model.Playlist;
import com.stefanini.spotify.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    private final PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    public List<Playlist> findAllPlaylist() {
        return playlistRepository.findAll();
    }

    /*
    public Playlist findById(Long id) {
        return playlistRepository.findById(id);
    }*/

    public Playlist save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}
