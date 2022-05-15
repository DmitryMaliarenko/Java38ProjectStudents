package com.company.model;

public class Student {
    private People people;

    public Student(People people) {
        this.people = people;
    }
    public void displayInfo() {
        System.out.println("Студент:\n   " + people.displayInfo());
    }
}

