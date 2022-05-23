package com.company;

import com.company.model.*;
import com.company.repository.GroupRepository;
import com.company.repository.MethodistRepository;
import com.company.repository.StudentRepository;
import com.company.repository.TeacherRepository;
import com.company.service.GroupService;
import com.company.service.MethodistService;
import com.company.service.StudentService;
import com.company.service.TeacherService;
import com.company.util.Converter;
import com.company.util.ParserUtilGroup;
import com.company.util.ParserUtilStudent;
import com.company.util.ParserUtilTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ParserUtilTeacher parserUtilTeacher = new ParserUtilTeacher();
        List<Teacher> teacherInfo = parserUtilTeacher.parserTeacher("Teacher.txt");
        ParserUtilStudent parserUtilStudent = new ParserUtilStudent();
        List<Student> studentInfo = parserUtilStudent.parserStudent("Student.txt");
        ParserUtilGroup parserUtilGroup = new ParserUtilGroup();
        List<Group> groupInfo = parserUtilGroup.parserGroup("Group.txt", teacherInfo, studentInfo);

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        TeacherRepository teacherRepository = new TeacherRepository();
        teacherRepository.setTeacher(teacherInfo);
        TeacherService teacherService = new TeacherService(teacherRepository);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        MethodistRepository methodistRepository = new MethodistRepository();
        MethodistService methodistService = new MethodistService(methodistRepository);

        Teacher teacher1 = teacherInfo.get(0);
        teacherService.finalSalary(teacher1, 1300, 1.4, 21,21);
        Teacher teacher2 = teacherInfo.get(1);
        teacherService.finalSalary(teacher2, 1300, 1.45, 21, 21);
        Teacher teacher3 = teacherInfo.get(2);
        teacherService.finalSalary(teacher3, 1400, 1.35, 21,21);
        Teacher teacher4 = teacherInfo.get(3);
        teacherService.finalSalary(teacher4, 1500, 1.5, 21, 21);

        ArrayList<Teacher> teachers = new ArrayList<>() {{
            add(teacher1);
            add(teacher2);
            add(teacher3);
            add(teacher4);
        }};

        ArrayList<Group> groups = new ArrayList<>() {{
            add(groupInfo.get(0));
            add(groupInfo.get(1));
        }};

        groupService.String(groups);
        System.out.println("Новая группа");
        groupService.addGroups(groups, groupInfo.get(2));
        System.out.println("Добавить студента");
        Student newStudents = studentInfo.get(6);
        System.out.println("Укажите группу:");

        switch (scanner.nextInt()) {
            case 1:
                studentService.addStudent(groupInfo.get(0).getStudents(), newStudents);
                break;
            case 2:
                studentService.addStudent(groupInfo.get(1).getStudents(), newStudents);
                break;
            case 3:
                studentService.addStudent(groupInfo.get(2).getStudents(), newStudents);
                break;
        }

        System.out.println("Удалить студента");
        System.out.println("Укажите группу:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                studentService.removeStudent(groupInfo.get(0).getStudents(), groupInfo.get(0).getStudents().get(1));
                break;
            case 2:
                studentService.removeStudent(groupInfo.get(1).getStudents(), groupInfo.get(1).getStudents().get(1));
                break;
            case 3:
                studentService.removeStudent(groupInfo.get(2).getStudents(), groupInfo.get(2).getStudents().get(1));
                break;
        }

        System.out.println("Редактировать данные студента");
        System.out.println("Укажите группу:");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                studentService.changeStudent(groupInfo.get(0).getStudents(), "Иван");
                break;
            case 2:
                studentService.changeStudent(groupInfo.get(1).getStudents(), "Александр");
                break;
            case 3:
                studentService.changeStudent(groupInfo.get(2).getStudents(), "Олег");
                break;
        }

        System.out.println("Преподавательский состав");

        Converter<Methodist, Teacher> converter = newTeacher -> new Methodist(newTeacher.getName(), newTeacher.getSurName(), newTeacher.getAge(), newTeacher.getGender(), teachers, 1700);
        Teacher newTeacher = teacherInfo.get(4);
        teacherService.addTeacher(teachers, newTeacher);
        System.out.println("Назначить методиста");
        Methodist methodist = converter.convert(newTeacher);
        System.out.println(methodist.toString());
        teacherService.removeTeacher(teachers, newTeacher);
        System.out.println();

        System.out.println("Изменить данные преподавателя");
        teacherService.changeTeacher(teachers, "");
        System.out.println("Преподаватели на пенсии:");
        teacherService.sortPension(teachers);
        System.out.println();
        System.out.println("Преподаватели с зарплатой свыше 2000:");
        teacherService.sortHighZP(teachers);
        System.out.println();
        System.out.println("Группы которые выпустятся не позднее 2025:");
        groupService.sortOfEnding(groups);

        System.out.println("Изменить группу");
        System.out.println("Укажите номер группы:");
        number = scanner.nextInt();
        groupService.changeGroups(groups, number);
        System.out.println("Удалить группу");
        System.out.println("Укажите номер группы:");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                groupService.removeGroups(groups, groupInfo.get(0));
                break;
            case 2:
                groupService.removeGroups(groups, groupInfo.get(1));
                break;
            case 3:
                groupService.removeGroups(groups, groupInfo.get(2));
                break;
        }
    }
}
