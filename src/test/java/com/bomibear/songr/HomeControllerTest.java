package com.bomibear.songr;

import com.bomibear.songr.controllers.HomeController;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void canCapitalizeLetter(){
        String word = "hello";
        HomeController hc = new HomeController();

        assertTrue(hc.capitalizeWord(word).equals("HELLO"));
    }

    @Test
    public void canReverseSentence(){
        String sentence = "Hello world";
        HomeController hc = new HomeController();

        assertTrue(hc.reverseSentence(sentence).equals("world Hello"));
    }
}