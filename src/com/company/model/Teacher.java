package com.company.model;

import com.company.base.People;
import com.company.repository.TeacherRepository;
import com.company.util.AgeUtil;

public class Teacher extends People implements Comparable<Teacher> {
    TeacherRepository teacherRepository = new TeacherRepository();
    private double zp;
    private Address address;

    public Teacher(String name, String surName, int age, String gender, Address address) {
        super(name, surName, age, gender);
        this.address = address;
        if (age > 0) {
            super.setAge(age);
        } else {
            super.setAge(1);
        }
        AgeUtil.checkAgeTeacher(age);
    }

    public void setZP(double zp) {
        this.zp = zp;
    }

    public double getZP() {
        return zp;
    }

    public Address getAddress() {
        return address;
    }

    public String displayInfo() {
        return "Преподаватель: " + super.toString() + "\n" + address.displayInfo() + " " + "\nЗарплата: " + zp;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getName().compareTo(o.getName());
    }
}