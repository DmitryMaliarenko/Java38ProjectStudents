package com.company.service;

import com.company.model.Teacher;
import com.company.repository.TeacherRepository;

import java.util.List;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void removeTeachers(List<Teacher> removeTeachers) {
        removeTeachers.forEach(te -> System.out.println(te));
        teacherRepository.removeTeachers(removeTeachers);
    }

    public void addTeachers(List<Teacher> newTeachers) {
        newTeachers.forEach(te -> System.out.println(te));
        teacherRepository.addTeachers(newTeachers);
    }
}
