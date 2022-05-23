package com.company.util;

import com.company.exception.CourseException;
import com.company.exception.GroupNameException;

public class GroupUtil {
    public static void checkGroup(int number, int course) {
        try {
            checkCourseException(course);
        } catch (CourseException e) {
            e.printStackTrace();
        }
        try {
            checkGroupException(number);
        } catch (GroupNameException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Данные по курсу и группе верны!");
        }
    }

    private static void checkGroupException(int number) throws GroupNameException {
        if (number < 0 || number > 20) {
            throw new GroupNameException("Номер группы указан не верно!");
        }
    }

    private static void checkCourseException(int curs) throws CourseException {
        if (curs < 1 || curs > 5) {
            throw new CourseException("Номер курса указан не верно!");
        }
    }
}
