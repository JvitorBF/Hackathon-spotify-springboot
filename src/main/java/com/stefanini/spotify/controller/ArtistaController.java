package com.stefanini.spotify.controller;

import com.stefanini.spotify.dto.ArtistaDto;
import com.stefanini.spotify.exception.AlbumNotFoundException;
import com.stefanini.spotify.exception.ArtistaNotFoundException;
import com.stefanini.spotify.mapper.ArtistaDtoService;
import com.stefanini.spotify.model.Album;
import com.stefanini.spotify.model.Artista;
import com.stefanini.spotify.service.AlbumService;
import com.stefanini.spotify.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistaController {

    private final ArtistaService artistaService;
    private final AlbumService albumService;
    private final ArtistaDtoService artistaDtoService;

    @Autowired
    public ArtistaController(ArtistaService artistaService, AlbumService albumService, ArtistaDtoService artistaDtoService) {
        this.artistaService = artistaService;
        this.albumService = albumService;
        this.artistaDtoService = artistaDtoService;
    }

    @RequestMapping(path = "/artista")
    public List<Artista> getAllArtista() {
        return artistaService.findAllArtista();
    }

    @PostMapping(value = "/artista")
    public String saveArtista(@RequestBody ArtistaDto artista) {
        Artista newArtista = artistaDtoService.mapArtista(artista);
        artistaService.save(newArtista);
        return newArtista.getNome_artista() + ", salvo com sucesso!";
    }

    @PutMapping(value = "/artista/{id}")
    public String updateArtista(@PathVariable("id") Long artistaId, @RequestBody ArtistaDto artista) throws ArtistaNotFoundException {
        Artista repo = artistaService.findById(artistaId);
        List<Album> albuns = repo.getAlbuns();
        repo = artistaDtoService.mapArtista(artista);
        repo.setId(artistaId);
        repo.setAlbuns(albuns);
        artistaService.save(repo);
        return "Artista atualizado com sucesso!";
    }

    @PutMapping(value = "/artista")
    public String updateArtista(@RequestParam Long artistaId, @RequestParam Long albumId) throws ArtistaNotFoundException, AlbumNotFoundException {
        Artista artistaRepo = artistaService.findById(artistaId);
        Album albumRepo = albumService.findById(albumId);
        artistaRepo.addAlbum(albumRepo);
        artistaService.save(artistaRepo);
        return "Artista atualizado com novo Album!";
    }

    @DeleteMapping(value = "/artista/{id}")
    public String deleteArtistaById(@PathVariable("id") Long artistaId) throws ArtistaNotFoundException {
        Artista artista = artistaService.findById(artistaId);
        artistaService.delete(artista);
        return "Artista deletado com sucesso!";
    }

}
