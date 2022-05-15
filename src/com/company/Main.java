package com.company;

import com.company.model.*;
import com.company.repository.GroupRepository;
import com.company.service.GroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);

        String group = "Java38";
        int course = 1;
        System.out.println("Группа: " + group + "\n" + "Курс: " + course + " курс\n");

        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
        Address aTPetrova = new Address("Минск", "Цикало", 78, 3);
        Address aTSidorova = new Address("Минск", "Каменогорская", 17, 56);
        Address aSGolubev = new Address("Гродно", "Ленина", 2, 7);
        Address aSZaharenko = new Address("Брест", "Советская", 15, 84);
        Address aSTkach = new Address("Витебск", "Гинтовта", 16, 3);
        Address aSGunko = new Address("Гомель", "Веры Хоружей", 129, 34);
        Address aSKoziol = new Address("Могилев", "Лобанка", 37, 57);
        Address aSShnurov = new Address("Минск", "газеты Правда", 1, 109);

        People pTIvanova = new People("Наждежда", "Иванова", 35, aTIvanova);
        People pTPetrova = new People("Татьяна", "Петрова", 27, aTPetrova);
        People pTSidorova = new People("Ирина", "Сидорова", 27, aTSidorova);
        People pSGolubev = new People("Иван", "Голубев", 18, aSGolubev);
        People pSZaharenko = new People("Андрей", "Захаренко", 18, aSZaharenko);
        People pSTkach = new People("Александр", "Ткач", 19, aSTkach);
        People pSGunko = new People("Виталий", "Гунько", 18, aSGunko);
        People pSKoziol = new People("Олег", "Козел", 19, aSKoziol);
        People pSShnurov = new People("Эдуард", "Шнуров", 18, aSShnurov);

        Teacher ivanova = new Teacher(pTIvanova);
        Teacher petrova = new Teacher(pTPetrova);
        Teacher sidorova = new Teacher(pTSidorova);
        List<Teacher> teachers = new ArrayList<>() {{
            add(ivanova);
            add(petrova);
            add(sidorova);
        }};
        System.out.println(teachers.size());


        System.out.println();

        Student golubev = new Student(pSGolubev);
        Student zaharenko = new Student(pSZaharenko);
        Student tkach = new Student(pSTkach);
        Student gunko = new Student(pSGunko);
        Student koziol = new Student(pSKoziol);
        Student shnurov = new Student(pSShnurov);
        List<Student> students = new ArrayList<>() {{
            add(golubev);
            add(zaharenko);
            add(tkach);
            add(gunko);
            add(koziol);
            add(shnurov);
        }};

        List<Student> students1 = new ArrayList<>() {{
            add(golubev);
            add(zaharenko);
        }};

        List<Student> students2 = new ArrayList<>() {{
            add(tkach);
            add(gunko);
        }};

        List<Student> students3 = new ArrayList<>() {{
            add(koziol);
            add(shnurov);
        }};

        Group group1 = new Group(students1, "группа №1", ivanova);
        Group group2 = new Group(students2, "группа №2", petrova);
        Group group3 = new Group(students3, "группа №3", sidorova);
        List<Group> groups = new ArrayList<>() {{
            add(group1);
            add(group2);
            add(group3);
        }};
        System.out.println(group3);
    }
}
