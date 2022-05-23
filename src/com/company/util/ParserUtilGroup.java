package com.company.util;

import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilGroup {
    public static List<Group> parserGroup(String file, List<Teacher> teachers, List<Student> students) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        ArrayList<Group> groups = new ArrayList<>();
        List<Group> groupsName = new ArrayList<>();
        int i = 0;
        ArrayList<Student> students1 = new ArrayList<>() {{
            add(students.get(0));
            add(students.get(1));
        }};
        ArrayList<Student> students2 = new ArrayList<>() {{
            add(students.get(2));
            add(students.get(3));
        }};
        ArrayList<Student> students3 = new ArrayList<>() {{
            add(students.get(4));
            add(students.get(5));
        }};
        try {
            fileReader = new FileReader(file);
            int a;
            String num = "";
            while ((a = fileReader.read()) != -1) {
                num += (char) a;
            }
            String[] massStr = num.split("\r\n");
            for (String n : massStr) {
                ArrayList<Student> studentArrayList = students1;
                String[] massValueString = n.split(" ");
                Group group = new Group(Integer.parseInt(massValueString[0]), Integer.parseInt(massValueString[1]), Integer.parseInt(massValueString[2]), Integer.parseInt(massValueString[3]));
                groupsName.add(group);
            }
            Group group1 = new Group(groupsName.get(0).getCourse(), groupsName.get(0).getGroupName(), teachers.get(0), students1, groupsName.get(0).getYearOfAdmission(), groupsName.get(0).getYearOfEnding());
            Group group2 = new Group(groupsName.get(1).getCourse(), groupsName.get(1).getGroupName(), teachers.get(1), students2, groupsName.get(1).getYearOfAdmission(), groupsName.get(1).getYearOfEnding());
            Group group3 = new Group(groupsName.get(2).getCourse(), groupsName.get(2).getGroupName(), teachers.get(2), students3, groupsName.get(2).getYearOfAdmission(), groupsName.get(2).getYearOfEnding());

            groups.add(group1);
            groups.add(group2);
            groups.add(group3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return groups;
    }
}
