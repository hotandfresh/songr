package com.bomibear.songr.controllers;

import com.bomibear.songr.models.Album;
import com.bomibear.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
