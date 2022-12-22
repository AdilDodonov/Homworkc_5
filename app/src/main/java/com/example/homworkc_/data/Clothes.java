package com.example.homworkc_.data;

public class Clothes {
    String name;
    String sena;
    int image;

    public Clothes(String name, String sena, int image) {
        this.name = name;
        this.sena = sena;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSena() {
        return sena;
    }

    public void setSena(String sena) {
        this.sena = sena;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
