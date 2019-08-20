package com.bomibear.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "helloWorld";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word, Model m){
        word = capitalizeWord(word);
        m.addAttribute("word", word);
        return "capitalize";
    }

    public String capitalizeWord(String word){
        return word.toUpperCase();
    }

    @GetMapping("/reverse")
    public String reverse(){
        return "reverse";
    }

}
