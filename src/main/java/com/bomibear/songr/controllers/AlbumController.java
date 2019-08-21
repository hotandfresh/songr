package com.bomibear.songr.controllers;

import com.bomibear.songr.models.Album;
import com.bomibear.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String getAllAlbums(Model m){
//        Album album1 = new Album("California Girls", "Katy Perry", 10, 500, "https://khuneva.files.wordpress.com/2012/02/california-girls.png");
//
//        Album album2 = new Album("Reign in Blood", "Slayer", 666, 666, "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/Reign_in_blood.jpg/220px-Reign_in_blood.jpg");
//
//        Album[] albums = new Album[]{album1, album2};

        List<Album> albums = albumRepository.findAll();

        m.addAttribute("albums", albums);

        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums(String title, String artist, int songCount, double length, String imageUrl){
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }
}
