package com.bomibear.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    double length;
    int trackNumber;

    @ManyToOne
    Album album;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public Song(){}

    public Song(String title, double length, int trackNumber, Album album){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }
}
