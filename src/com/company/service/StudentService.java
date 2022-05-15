package com.company.service;

import com.company.model.Student;
import com.company.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void removeStudents(List<Student> removeStudents) {
        removeStudents.forEach(st -> System.out.println(st));
        studentRepository.removeStudents(removeStudents);
    }

    public void addStudents(List<Student> newStudents) {
        newStudents.forEach(st -> System.out.println(st));
        studentRepository.addStudents(newStudents);
    }
    //Добавить метод изменения имени группы

}
