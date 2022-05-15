package com.company.model;

public class People {
    private String name;
    private String surName;
    private int age;
    private Address address;

    public People(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }
    public String displayInfo() {
        return name + " " + surName + " " + age + "\n" + address.displayInfo();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
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
