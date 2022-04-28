package com.company;

public class Teacher {
    private String name;
    private String surName;
    private int age;
    private Address address;
    int salary = 1000;
    double k = 1.23;
    int workDay = 21;
    int allDay = 21;

    public Teacher(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.printf("Преподаватель:\n   " + name + " " + surName + "\n" + address.displayInfo() + "\n");
    }
    double finalSalary() {
        double zp = salary * k * workDay / allDay;
        System.out.println("Зарплата преподавателя: " + zp + " рублей");
        return zp;
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
