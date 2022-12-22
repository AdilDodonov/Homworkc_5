package com.example.homworkc_.data;

public class Pizza {
    String name;
    String  sena;
    int image;

    public String getSena() {
        return sena;
    }

    public Pizza(String name, String sena, int image) {
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
