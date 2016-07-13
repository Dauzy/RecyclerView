package com.example.daniel.targetview;

/**
 * Created by Daniel on 20/04/2016.
 */
public class Landscape {

    private int picture;
    private String name;

    public Landscape(int picture, String name) {
        this.picture = picture;
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
