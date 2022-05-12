package com.company;

import com.company.model.Address;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.repository.GroupRepository;
import com.company.service.GroupService;

public class Main {

    public static void main(String[] args) {

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);

        String group = "Java38";
        int course = 1;
        System.out.println("Группа: " + group + "\n" + "Курс: " + course + " курс\n");

        Address[] address = new Address[6];
        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
        Address aTPetrova = new Address("Минск", "Цикало", 78, 3);
        Address aSGolubev = new Address("Гродно", "Ленина", 2, 7);
        Address aSZaharenko = new Address("Брест", "Советская", 15, 84);
        Address aSTkach = new Address("Витебск", "Гинтовта", 16, 3);
        Address aSGunko = new Address("Гомель", "Веры Хоружей", 129, 34);

        Teacher[] teacher = new Teacher[2];
        Teacher ivanova = new Teacher("Наждежда", "Иванова", 35, aTIvanova);
        Teacher petrova = new Teacher("Татьяна", "Петрова", 27, aTPetrova);
        teacher[0] = ivanova;
        teacher[1] = petrova;
        for (Teacher t : teacher) {
            t.displayInfo();
        }
        System.out.println();

        Student[] student = new Student[4];
        Student golubev = new Student("Иван", "Голубев", 18, aSGolubev);
        Student zaharenko = new Student("Андрей", "Захаренко", 18, aSZaharenko);
        Student tkach = new Student("Александр", "Ткач", 19, aSTkach);
        Student gunko = new Student("Виталий", "Гунько", 18, aSGunko);
        student[0] = golubev;
        student[1] = zaharenko;
        student[2] = tkach;
        student[3] = gunko;
        for (Student s : student) {
            s.displayInfo();
        }
    }
}
