package com.company.util;

import com.company.exception.SalaryException;
import com.company.exception.WorkDaysException;

public class SalaryUtil {
    public static void checkZP(int salary, double k, int workDays, int allDays) {
        try {
            checkSalaryException(salary);
        } catch (SalaryException e) {
            e.printStackTrace();
        }
        try {
            checkWorkDays(workDays, allDays);
        } catch (WorkDaysException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Данные для расчета заработной платы преподавателя подходят!");
        }
    }

    private static void checkSalaryException(int salary) throws SalaryException {
        if (salary < 0 || salary > 5000 || salary == 0) {
            throw new SalaryException("Не верно указан оклад");
        }
    }

    private static void checkWorkDays(int workDays, int allDays) throws WorkDaysException {
        if (workDays < 0 || workDays > 31 || workDays == 0) {
            throw new WorkDaysException("Не верно указано количество отработанных дней!");
        }
        if (allDays < 0 || allDays > 31 || allDays == 0) {
            throw new WorkDaysException("Не верно указано количество рабочих дней!");
        }
    }
}
