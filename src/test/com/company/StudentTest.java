package test.com.company;

import com.company.model.Address;
import com.company.model.Student;
import com.company.repository.StudentRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    List<Student> students;
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Student student6;
    Student addStudents;
    StudentRepository studentRepository = new StudentRepository();
    List<Student> studentList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        student1 = new Student("Иван", "Голубев", 18, "мужской", new Address("Гродно", "Ленина", 2, 7));
        student2 = new Student("Андрей", "Захаренко", 18, "мужской", new Address("Брест", "Советская", 15, 84));
        student3 = new Student("Александр", "Ткач", 19, "мужской", new Address("Витебск", "Гинтовта", 16, 3));
        student4 = new Student("Виталий", "Гунько", 18, "мужской", new Address("Гомель", "Веры Хоружей", 129, 34));
        student5 = new Student("Олег", "Козел", 19, "мужской", new Address("Могилев", "Лобанка", 37, 57));
        student6 = new Student("Эдуард", "Шнуров", 18, "мужской", new Address("Минск", "газеты Правда", 1, 109));
        addStudents = new Student("Юлия", "Иваничкина", 19, "женский", new Address("Гродно", "Ленина", 17, 28));
        students = new ArrayList<>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
            add(student5);
            add(student6);
        }};
        studentList = students;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Тест окончен");
    }

    @Test
    public void removeStudent() {
        int size = 5;
        studentList.remove(student6);
        studentRepository.removeStudents(studentList);
        assertTrue(size == studentList.size());
    }

    @Test
    public void addStudent() {
        int size = 7;
        studentList.add(addStudents);
        studentRepository.addStudents(studentList);
        assertTrue(size == studentList.size());
    }

    @Test
    public void changeStudent() {
        int index = 3;
        String name = "Виталий";
        students.set(1, new Student("Юлия", "Иваничкина", 19, "женский", new Address("Гродно", "Ленина", 17, 28)));
        for (Student s : studentList) {
            if (name.equals(s.getName())) {
                index = studentList.indexOf(s);
            }
        }
        studentList.set(index, addStudents);
        studentRepository.addStudents(studentList);
        assertEquals(students, studentList);
    }
}
