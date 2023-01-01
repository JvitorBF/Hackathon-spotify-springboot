package com.stefanini.spotify.controller;

import com.stefanini.spotify.dto.AlbumDto;
import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.mapper.AlbumDtoService;
import com.stefanini.spotify.model.Album;
import com.stefanini.spotify.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumController {
    private final AlbumService albumService;
    private final AlbumDtoService albumDtoService;

    @Autowired
    public AlbumController(AlbumService albumService, AlbumDtoService albumDtoService) {
        this.albumService = albumService;
        this.albumDtoService = albumDtoService;
    }

    @RequestMapping(path = "/api/album")
    public List<Album> getAllAlbums() {
        return albumService.findAllAlbum();
    }

    @GetMapping(value = "/api/album/{id}")
    public Album getAlbum(@PathVariable("id") Long albumId) throws AlbumNotFoundException {
        return albumService.findById(albumId);
    }

    //@PostMapping
    @PostMapping(value = "/api/album")
    public String saveAlbum(@RequestBody AlbumDto album) {
        Album newAlbum = albumDtoService.mapAlbum(album);
        albumService.save(newAlbum);
        return album.getNome_album() + ", salvo com sucesso!";
    }

    //@PutMapping
    @PutMapping(value = "/api/album/{id}")
    public String updateAlbum(@PathVariable("id") Long albumId, @RequestBody AlbumDto album) throws AlbumNotFoundException {
        Album repo = albumService.findById(albumId);
        repo = albumDtoService.mapAlbum(album);
        repo.setId(albumId);
        albumService.save(repo);
        return "Album atualizado com sucesso!";
    }

    //@DeleteMapping
    @DeleteMapping(value = "/api/album/{id}")
    public String deleteAlbumById(@PathVariable("id") Long albumId) throws AlbumNotFoundException {
        Album album = albumService.findById(albumId);
        albumService.delete(album);
        return "Album deletado com sucesso!";
    }

}
