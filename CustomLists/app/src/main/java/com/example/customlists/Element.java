package com.example.customlists;

public class Element {
    String name;
    String artist;
    int i;

    public Element(String name, String artist, int i) {
        this.name = name;
        this.artist = artist;
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
