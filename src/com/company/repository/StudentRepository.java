package com.company.repository;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
        private List<Student> students = new ArrayList<>();

        public void removeStudents(List<Student> removeStudents) {
            students.removeAll(removeStudents);
        }

        public void addStudents(List<Student> newStudents) {
            students.addAll(newStudents);
        }

        public List<Student> getStudents() {
            return students;
        }
}
