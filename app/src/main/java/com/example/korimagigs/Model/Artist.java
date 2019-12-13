package com.example.korimagigs.Model;

import com.example.korimagigs.R;

public class Artist {
    private String id;
    private String img;
    private String type;
    private String username;

    public Artist(String id, int def_user, String artista, String asd) {
    }

    public Artist(String id, String img, String type, String username) {
        this.id = id;
        this.img = img;
        this.type = type;
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
