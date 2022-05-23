package com.company.service;

import com.company.model.Address;
import com.company.model.Teacher;
import com.company.repository.TeacherRepository;
import com.company.util.MaxZPComparator;
import com.company.util.SalaryUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void removeTeacher(List<Teacher> removeTeacher, Teacher teacher) {
        Comparator salaryComparator = new MaxZPComparator();
        System.out.println("Преподаватель удален");
        removeTeacher.remove(teacher);
        removeTeacher.stream()
                .sorted(salaryComparator)
                .forEach(System.out::println);
        teacherRepository.removeTeacher(removeTeacher);
    }

    public void addTeacher(List<Teacher> newTeacher, Teacher teacher) {
        Comparator salaryComparator = new MaxZPComparator();
        System.out.println("Преподаватель добавлен");
        newTeacher.add(teacher);
        newTeacher
                .stream()
                .sorted(salaryComparator)
                .forEach(System.out::println);
        teacherRepository.addTeacher(newTeacher);
    }

    private static Address dataAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес преподавателя");
        System.out.println("Введите город проживания:");
        String cityTeacher = scanner.nextLine();
        System.out.println("Введите название улицы:");
        String streetTeacher = scanner.nextLine();
        System.out.println("Введите номер дома:");
        int homeTeacher = scanner.nextInt();
        System.out.println("Введите номер квартиры:");
        int flatTeacher = scanner.nextInt();
        Address address = new Address(cityTeacher, streetTeacher, homeTeacher, flatTeacher);
        return address;
    }

    public void changeTeacher(List<Teacher> changeTeacher, String name) {
        Comparator salaryComparator = new MaxZPComparator();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Teacher teacher = null;
        for (Teacher t : changeTeacher) {
            if (name.equalsIgnoreCase(t.getName())) {
                index = changeTeacher.indexOf(t);
                System.out.println("Введите данные преподавателя:");
                System.out.println("Введите имя:");
                String nameTeacher = scanner.nextLine();
                System.out.println("Введите фамилию:");
                String surNameTeacher = scanner.nextLine();
                System.out.println("Введите возраст:");
                int ageTeacher = scanner.nextInt();
                System.out.println("Введите пол:");
                String gender = scanner.nextLine();
                teacher = new Teacher(nameTeacher, surNameTeacher, ageTeacher, gender, dataAddress());
                System.out.println("Введите данные для расчета заработной платы:");
                System.out.println("Введите размер оклада:");
                int salary = scanner.nextInt();
                System.out.println("Введите коэффициент:");
                double k = scanner.nextInt();
                System.out.println("Введите количество отработанных дней:");
                int workDays = scanner.nextInt();
                System.out.println("Введите количество отработанных дней:");
                int allDays = scanner.nextInt();
                finalSalary(teacher, salary, k, workDays, allDays);
            }
        }
        System.out.println("Данные преподавателя изменены");
        changeTeacher.set(index, teacher);
        changeTeacher.stream()
                .sorted(salaryComparator)
                .forEach(System.out::println);
        teacherRepository.setTeacher(changeTeacher);
    }

    public void finalSalary(Teacher teacher, int salary, double k, int workDays, int allDays) {
        SalaryUtil.checkZP(salary, k, workDays, allDays);
        double zp;
        zp = (((salary * k) / allDays) * workDays);
        teacher.setZP(zp);
    }

    public void sortHighZP(List<Teacher> teachers) {
        Comparator salaryComparator = new MaxZPComparator();
        teachers.stream()
                .filter(s -> s.getZP() > 2000)
                .sorted(salaryComparator)
                .forEach(s -> System.out.println(s));
    }

    public void sortPension(List<Teacher> teachers) {
        Comparator salaryComparator = new MaxZPComparator();
        teachers.stream()
                .filter(s -> s.getAge() > 58 && s.getGender().equalsIgnoreCase("женский") || s.getAge() > 63 && s.getGender().equalsIgnoreCase("мужской"))
                .sorted(salaryComparator)
                .forEach(s -> System.out.println(s));
    }
}
