package com.stefanini.spotify.mapper;
import com.stefanini.spotify.dto.AlbumDto;
import com.stefanini.spotify.dto.ArtistaDto;
import com.stefanini.spotify.dto.MusicaDto;
import com.stefanini.spotify.dto.PlaylistDto;
import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.exception.ArtistaNotFoundException;
import com.stefanini.spotify.exception.PlaylistNotFoundException;
import com.stefanini.spotify.model.Album;
import com.stefanini.spotify.model.Artista;
import com.stefanini.spotify.model.Musica;
import com.stefanini.spotify.model.Playlist;
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

    public Musica mapMusica(MusicaDto musica) throws ArtistaNotFoundException, PlaylistNotFoundException, AlbumNotFoundException {

        Artista artista = artistaService.findById(musica.getArtista());
        Playlist playlist = playlistService.findById(musica.getPlaylist());
        Album album = albumService.findById(musica.getAlbum());

        Musica newMusica = new Musica(null,
                musica.getNome_musica(),
                musica.getDuracao(),
                artista,
                playlist,
                album);
        return newMusica;
    }

}

