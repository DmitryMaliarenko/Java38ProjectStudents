package com.company.repository;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void removeStudents(List<Student> removeStudents) {
        students.remove(removeStudents);
    }

    public void addStudents(List<Student> addStudents) {
        students.addAll(addStudents);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
