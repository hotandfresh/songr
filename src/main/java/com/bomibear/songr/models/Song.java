package com.bomibear.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    double seconds;
    int trackNumber;

    @ManyToOne
    Album album;

    public Song(){}

    public Song(String title, double seconds, int trackNumber, Album album) {
        this.title = title;
        this.seconds = seconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }
}
