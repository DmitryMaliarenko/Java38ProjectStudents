package com.company.service;

import com.company.model.Group;
import com.company.model.Student;
import com.company.repository.GroupRepository;
import com.company.util.GroupComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GroupService {
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroups(List<Group> addGroups, Group group) {
        System.out.println("Создать группу:");
        addGroups.add(group);
        addGroups.forEach(gr -> System.out.println(gr.displayInfo()));
        groupRepository.addGroups(addGroups);
    }

    public void removeGroups(List<Group> removeGroups, Group removeGroup) {
        System.out.println("Удалить группу:");
        removeGroups.remove(removeGroup);
        removeGroups.forEach(gr -> System.out.println(gr.displayInfo()));
        groupRepository.removeGroups(removeGroups);
    }

    public void changeGroups(List<Group> changeGroups, int number) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Group groupChange = null;
        for (Group g : changeGroups) {
            if (number == g.getGroupName()) {
                index = changeGroups.indexOf(g);
                System.out.println("Ведите новые данные группы:");
                System.out.println("Введите номер группы:");
                int groupName = scanner.nextInt();
                System.out.println("Введите курс группы:");
                int course = scanner.nextInt();
                System.out.println("Введите год поступления:");
                int yearOfAdmission = scanner.nextInt();
                System.out.println("Введите год окончания:");
                int yearOfEnding = scanner.nextInt();
                groupChange = new Group(groupName, course, g.getTeacher(), (ArrayList<Student>) g.getStudents(), yearOfAdmission, yearOfEnding);
            }
        }
        changeGroups.set(index, groupChange);
        changeGroups.forEach(group -> System.out.println(group.displayInfo()));
        groupRepository.setGroups(changeGroups);
    }

    public void sortOfEnding(List<Group> groups) {
        Comparator groupComparator = new GroupComparator();
        groups.stream()
                .filter(e -> e.getYearOfEnding() <= 2025)
                .sorted(groupComparator)
                .forEach(e -> System.out.println(((Group) e).displayInfo()));
    }

    public void String(List<Group> groups) {
        groups.stream()
                .forEach(group -> System.out.println(((Group) group).displayInfo()));
    }
}