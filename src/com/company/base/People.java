package com.company.base;

public class People {
    private String name;
    private String surName;
    private int age;
    private String gender;

    public People(String name, String surName, int age, String gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surName + ", " + age + " лет, пол:  " + gender;
    }
}
