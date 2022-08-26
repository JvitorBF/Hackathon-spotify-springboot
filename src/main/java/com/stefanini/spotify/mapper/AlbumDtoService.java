package com.stefanini.spotify.mapper;

import com.stefanini.spotify.dto.AlbumDto;
import com.stefanini.spotify.model.Album;
import org.springframework.stereotype.Service;

@Service
public class AlbumDtoService {

    public Album mapAlbum(AlbumDto album) {
        Album newAlbum = new Album(null, album.getNome_album(), album.getData(), null);
        return newAlbum;
    }
}
