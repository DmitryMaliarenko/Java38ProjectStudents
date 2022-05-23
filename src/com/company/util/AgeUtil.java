package com.company.util;

import com.company.exception.AgeStudentException;
import com.company.exception.AgeTeacherException;

public class AgeUtil {
    public static void checkAgeStudent(int age) {
        try {
            checkAgeS(age);
        } catch (AgeStudentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Возраст студента удовлетворяет требованиям");
        }
    }

    public static void checkAgeTeacher(int age) {
        try {
            checkAgeT(age);
        } catch (AgeTeacherException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Возраст преподавателя удовлетворяет требованиям");
        }
    }

    private static void checkAgeS(int age) throws AgeStudentException {
        if (age < 17) {
            throw new AgeStudentException("Не верный возраст");
        }
        if (age > 50) {
            throw new AgeStudentException("Подмайте лучше");
        }
    }

    private static void checkAgeT(int age) throws AgeTeacherException {
        if (age < 22) {
            throw new AgeTeacherException("Не верный возраст");
        }
        if (age > 70) {
            throw new AgeTeacherException("Пенсионный возраст");
        }
    }
}