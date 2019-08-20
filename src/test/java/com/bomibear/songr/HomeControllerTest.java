package com.bomibear.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void canCapitalizeLetter(){
        String word = "hello";
        HomeController hc = new HomeController();

        assertTrue(hc.capitalizeWord(word).equals("HELLO"));
    }

}