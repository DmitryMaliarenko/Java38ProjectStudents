package com.company;

public class Employee {
    private String name;
    private String surName;
    private int age;
    private String profession;
    private int salary;

    public Employee(String name, String surName, int age, String profession, int salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.profession = profession;
        this.salary = salary;
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

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + surName + ", " + age + " лет, " + profession + ", зарплата: " + salary;
    }
}