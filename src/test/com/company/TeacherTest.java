package test.com.company;

import com.company.model.Address;
import com.company.model.Teacher;
import com.company.repository.TeacherRepository;
import com.company.service.TeacherService;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeacherTest {
    Teacher teacher1;
    Teacher teacher2;
    Teacher teacher3;
    Teacher teacher4;
    Teacher addTeacher;
    TeacherRepository teacherRepository = new TeacherRepository();
    List<Teacher> teachers;
    List<Teacher> teacherList;

    @Before
    public void setUp() throws Exception {
        teacher1 = new Teacher("Александра", "Тиханова", 35, "женский", new Address("Минск", "Ленина", 187, 35));
        teacher2 = new Teacher("Наждежда", "Иванова", 35, "женский", new Address("Минск", "Гурской", 20, 18));
        teacher3 = new Teacher("Татьяна", "Петрова", 27, "женский", new Address("Минск", "Цикало", 78, 3));
        teacher4 = new Teacher("Ирина", "Сидорова", 27, "женский", new Address("Минск", "Каменогорская", 17, 56));
        addTeacher = new Teacher("Николай", "Федоров", 47, "мужской", new Address("Минск", "Есенина", 1, 117));
        teachers = new ArrayList<>() {{
            add(teacher1);
            add(teacher2);
            add(teacher3);
        }};
        teacherList = teachers;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");

    }

    @Test
    public void removeTeacher() {
        int size = 2;
        teacherList.remove(teacher1);
        teacherRepository.removeTeacher(teacherList);
        assertTrue(size == teacherList.size());

    }

    @Test
    public void addTeacher() {
        int size = 4;
        teacherList.add(teacher4);
        teacherRepository.addTeacher(teacherList);
        assertTrue(size == teacherList.size());

    }

    @Test
    public void changeTeacher() {
        int index = 2;
        String name = "Татьяна";
        teachers.set(index, addTeacher);
        for (Teacher n : teacherList) {
            if (name.equalsIgnoreCase(n.getName())) {
                index = teacherList.indexOf(n);
            }
            teacherList.set(index, addTeacher);
            teacherRepository.setTeacher(teacherList);
            assertEquals(teachers, teacherList);
        }
    }

    @Test
    public void finalSalary() {
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService(teacherRepository);
        int salary = 1300;
        double k = 1.45;
        int workDays = 21;
        int allDays = 21;
        double zp = (((salary * k) / allDays) * workDays);
        teacherService.finalSalary(teacher1, salary, k, workDays, allDays);
        double realZp = teacher1.getZP();
        assertTrue(zp == realZp);
    }
}