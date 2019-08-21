package com.bomibear.songr.controllers;

import com.bomibear.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        Album album1 = new Album("California Girls", "Katy Perry", 10, 500, "https://khuneva.files.wordpress.com/2012/02/california-girls.png");

        Album album2 = new Album("Reign in Blood", "Slayer", 666, 666, "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/Reign_in_blood.jpg/220px-Reign_in_blood.jpg");

        Album[] albums = new Album[]{album1, album2};

        m.addAttribute("albums", albums);

        return "allAlbums";
    }
}
