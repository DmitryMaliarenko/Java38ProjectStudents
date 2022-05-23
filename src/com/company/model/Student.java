package com.company.model;

import com.company.base.People;
import com.company.util.AgeUtil;

public class Student extends People implements Comparable<Student> {
    private Address address;

    public Student(String name, String surName, int age, String gender, Address address) {
        super(name, surName, age, gender);
        AgeUtil.checkAgeStudent(age);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String displayInfo() {
        return "Студент: " + super.toString() + " " + address.displayInfo();
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}