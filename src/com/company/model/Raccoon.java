package com.company.model;

public class Raccoon {
    private  String name;
    private int age;
    private String color;

    public Raccoon(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
