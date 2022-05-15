package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Алексей","Платун", 30, "начальник", 2100),
                new Employee("Владимир","Кадевич", 61, "ведущий инженер", 1900),
                new Employee("Сергей","Телехович", 45, "мастер", 1500),
                new Employee("Юрий","Иванов", 48, "ведущий технолог", 1800),
                new Employee("Игорь","Горбель", 49, "технолог", 1700),
                new Employee("Евгений","Чижик", 36, "технолог", 1600),
                new Employee("Александр","Дашко", 60, "машинист", 1800),
                new Employee("Андрей","Евженико", 48, "машинист", 1600),
                new Employee("Виктор","Ершов", 42, "машинист", 1300),
                new Employee("Михаил","Бруй", 50, "машинист", 1500),
                new Employee("Роман","Горинов", 33, "машинист", 1100),
                new Employee("Игорь","Новиков", 52, "машинист", 1700),
                new Employee("Андрей","Бахта", 45, "машинист", 1400),
                new Employee("Геннадий","Войтович", 46, "машинистк", 1600),
                new Employee("Александр","Валевач", 51, "машинист", 1200)));
        for (Employee e: employees) {
            System.out.println(e + ", ");
        }
        System.out.println();
        employees.stream()
                .filter(e -> e.getSurName().indexOf("Е") == 0)
                .forEach(e -> System.out.println(e));
        System.out.println();

        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        System.out.println("Исходный массив");
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(0, 100));
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        arrayList.stream()
                .sorted()
                .forEach(e -> System.out.print(e + ", "));
    }
}