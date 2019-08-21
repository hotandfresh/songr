package com.bomibear.songr.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    long id;
    String title;
    String artist;
    int songCount;
    double length;
    String imageUrl;

    public Album(String title, String artist, int songCount, double length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public double getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
