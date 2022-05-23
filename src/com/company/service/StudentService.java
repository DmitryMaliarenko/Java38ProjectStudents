package com.company.service;

import com.company.model.Address;
import com.company.model.Student;
import com.company.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void removeStudent(List<Student> removeStudent, Student student) {
        System.out.println("Студент удален");
        removeStudent.remove(student);
        removeStudent.forEach(s -> System.out.println(s.displayInfo()));
        studentRepository.removeStudents(removeStudent);
    }

    public void addStudent(List<Student> addStudent, Student student) {
        System.out.println("Студент добавлен");
        addStudent.add(student);
        addStudent.forEach(s -> System.out.println(s.displayInfo()));
        studentRepository.addStudents(addStudent);
    }

    private static Address dataAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес студента:");
        System.out.println("Введите город проживания:");
        String cityStudent = scanner.nextLine();
        System.out.println("Введите название улицы:");
        String streetStudent = scanner.nextLine();
        System.out.println("Введите номер дома:");
        int homeStudent = scanner.nextInt();
        System.out.println("Введите номер квартиры:");
        int flatStudent = scanner.nextInt();
        Address address = new Address(cityStudent, streetStudent, homeStudent, flatStudent);
        return address;
    }

    public void changeStudent(List<Student> changeStudent, String name) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Student student = null;
        for (Student s : changeStudent) {
            if (name.equals(s.getName())) {
                index = changeStudent.indexOf(s);
                System.out.println("Введите данные студента:");
                System.out.println("Введите имя:");
                String nameStudent = scanner.nextLine();
                System.out.println("Введите фамилию:");
                String surNameStudent = scanner.nextLine();
                System.out.println("Введите возраст:");
                int ageStudent = scanner.nextInt();
                System.out.println("Введите пол:");
                String genderStudent = scanner.nextLine();
                student = new Student(nameStudent, surNameStudent, ageStudent, genderStudent, dataAddress());
            }
        }
        System.out.println("Данные студента изменены");
        changeStudent.set(index, student);
        studentRepository.setStudents(changeStudent);
        changeStudent.forEach(student1 -> System.out.println(student1.displayInfo()));
    }
}