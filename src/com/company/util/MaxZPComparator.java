package com.company.util;

import com.company.model.Teacher;

import java.util.Comparator;

public class MaxZPComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int rez = (int) (Math.round(o2.getZP()) - Math.round(o1.getZP()));
        if (rez == 0) {
            rez = o1.getAge() - o2.getAge();
        }
        return rez;
    }
}
