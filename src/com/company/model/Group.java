package com.company.model;

import com.company.util.GroupUtil;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int course;
    private int groupName;
    private Teacher teacher;
    private ArrayList<Student> students;
    private int yearOfAdmission;
    private int yearOfEnding;

    public Group(int course, int groupName, Teacher teacher, ArrayList<Student> students, int yearOfAdmission, int yearOfEnding) {
        this.course = course;
        this.groupName = groupName;
        GroupUtil.checkGroup(groupName, course);
        this.teacher = teacher;
        this.students = students;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfEnding = yearOfEnding;
    }

    public Group(int course, int groupName, int yearOfAdmission, int yearOfEnding) {
        this.course = course;
        this.groupName = groupName;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfEnding = yearOfEnding;
    }
    public int getCourse() {
        return course;
    }

    public int getGroupName() {
        return groupName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getYearOfEnding() {
        return yearOfEnding;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public List<Student> studentInfo() {
        students.stream()
                .sorted()
                .forEach(System.out::println);
        return students;
    }

    public String displayInfo() {
        return "Группа: " + groupName + ", курс: " + course + "\n" + teacher.displayInfo() + "\n" + students + "\n" + yearOfAdmission + " - " + yearOfEnding;
    }
}