package com.example.korimagigs.Model;


import com.example.korimagigs.R;

public class Artist {
private String id;
private String name;
private String genero;
private String imageURL;

    public Artist(String id, String name, String imageURL, String genero) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.genero = genero;
    }

public Artist(){

}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
