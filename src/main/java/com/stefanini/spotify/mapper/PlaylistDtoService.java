package com.stefanini.spotify.mapper;
import com.stefanini.spotify.dto.PlaylistDto;
import com.stefanini.spotify.exception.UsuarioNotFoundException;
import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.model.Playlist;
import com.stefanini.spotify.model.Usuario;
import com.stefanini.spotify.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistDtoService {

    private final UsuarioService usuarioService;

    @Autowired
    public PlaylistDtoService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Playlist mapPlaylist(PlaylistDto playlist) throws UsuarioNotFoundException {
        Usuario usuario = usuarioService.findById(playlist.getUsuario());

        Playlist newPlaylist = new Playlist(null,
                playlist.getNome_playlist(),
                playlist.getDescricao(),
                null,
                usuario);
        return newPlaylist;
    }

    public Playlist addPlaylist_musica(Playlist playlistRepo) {
        List<Musica> musicas = playlistRepo.getMusicas();
        playlistRepo.setMusicas(musicas);
        return playlistRepo;
    }



}
