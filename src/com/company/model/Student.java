package com.company.model;

import com.company.model.Address;

public class Student {
    private String name;
    private String surName;
    private int age;
    private Address address;

    public Student(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Студент:\n   " + name + " " + surName + "\n" + address.displayInfo());
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(Address address) {
        this.address = address;
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
    public Address getAddress() {
        return address;
    }
}

