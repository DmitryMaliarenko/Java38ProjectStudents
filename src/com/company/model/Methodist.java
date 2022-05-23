package com.company.model;

import com.company.base.People;

import java.util.ArrayList;

public class Methodist extends People {
    private double salary;
    private ArrayList<Teacher> teachers;

    public Methodist(String name, String surName, int age, String gender, ArrayList<Teacher> teachers, double salary) {
        super(name, surName, age, gender);
        this.teachers = teachers;
        this.salary = salary;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", методист, оклад: " + salary;
    }
}
