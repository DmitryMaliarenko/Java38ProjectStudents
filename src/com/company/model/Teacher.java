package com.company.model;

public class Teacher {
    int salary = 1000;
    double k = 1.23;
    int workDay = 21;
    int allDay = 21;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public void setAllDay(int allDay) {
        this.allDay = allDay;
    }

    private People people;

    public Teacher(People people) {
        this.people = people;
    }
    public void displayInfo() {
        System.out.println("Преподаватель:\n   " + people.displayInfo());
    }
    public double finalSalary() {
        double zp = salary * k * workDay / allDay;
        System.out.println("Зарплата преподавателя: " + zp + " рублей");
        return zp;
    }
}
