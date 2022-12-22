package com.example.homworkc_.data;

public class Car {
    String name;
    String age;
    String sena;
    int image;

    public Car(String name, String age, String sena, int image) {
        this.name = name;
        this.age = age;
        this.sena = sena;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
