package com.company.util;

import com.company.model.Address;
import com.company.model.Teacher;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilTeacher {
    public static List<Teacher> parserTeacher(String file) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int a;
            String num = "";
            while ((a = fileReader.read()) != -1) {
                num += (char) a;
            }
            String[] massStr = num.split("\n");
            for (String n : massStr) {
                String[] massValue = n.split(" ");
                Address address = new Address(massValue[4], massValue[5], Integer.parseInt(massValue[6]), Integer.parseInt(massValue[7]));
                Teacher teacher = new Teacher(massValue[0], massValue[1], Integer.parseInt(massValue[2]), massValue[3], address);
                teachers.add(teacher);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return teachers;
    }
}
