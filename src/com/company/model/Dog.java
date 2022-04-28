package com.company.model;

public class Dog {
    private  String name;
    private int age;
    private int weught;

    public Dog(String name, int age, int weught) {
        this.name = name;
        this.age = age;
        this.weught = weught;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeught() {
        return weught;
    }
}
