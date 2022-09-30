package com.stefanini.spotify.mapper;

import com.stefanini.spotify.dto.MusicaDto;
import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.model.Album;
import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.service.AlbumService;
import com.stefanini.spotify.service.ArtistaService;
import com.stefanini.spotify.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MusicaDtoService {

    private final ArtistaService artistaService;
    private final PlaylistService playlistService;
    private final AlbumService albumService;

    @Autowired
    public MusicaDtoService(ArtistaService artistaService, PlaylistService playlistService, AlbumService albumService) {
        this.artistaService = artistaService;
        this.playlistService = playlistService;
        this.albumService = albumService;
    }

    public Musica mapMusica(MusicaDto musica) throws AlbumNotFoundException {
        Album album = albumService.findById(musica.getAlbum());

        Musica newMusica = new Musica(null,
                musica.getNome_musica(),
                musica.getDuracao(),
                album);
        return newMusica;
    }

}

