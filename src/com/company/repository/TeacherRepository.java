package com.company.repository;

import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private List<Teacher> teachers = new ArrayList<>();
    private double zp;

    public void removeTeacher(List<Teacher> removeTeachers) {
        teachers.remove(removeTeachers);
    }

    public void addTeacher(List<Teacher> addTeachers) {
        teachers.addAll(addTeachers);
    }

    public void setTeacher(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
