package com.bomibear.songr.controllers;

import com.bomibear.songr.models.Album;
import com.bomibear.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums/{id}")
    public String getOneAlbum(@PathVariable long id, Model m){
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "oneAlbum";
    }

//    @GetMapping("/albums")
//    public String getAllAlbums(Model m){
//        List<Album> albums = albumRepository.findAll();
//
//        m.addAttribute("albums", albums);
//
//        return "allAlbums";
//    }
//
//    @PostMapping("/albums")
//    public RedirectView addAlbums(String title, String artist, int songCount, double length, String imageUrl){
//        Album album = new Album(title, artist, songCount, length, imageUrl);
//        albumRepository.save(album);
//        return new RedirectView("/albums");
//    }

//    @GetMapping("/albums/{id}")
//    public String getOneAlbum(@PathVariable long id, Model m){
//
//        return "oneAlbum";
//    }
}
