package test.com.company;

import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class TeacherTest {

    Teacher teacher1;

    @Before
    public void setUp() throws Exception {
        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
        teacher1 = new Teacher("Наждежда", "Иванова", 35, aTIvanova);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void finalSalary() {
//        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
//        Teacher teacher1 = new Teacher("Наждежда", "Иванова", 35, aTIvanova);
        int salary = 1000;
        double k = 1.23;
        int workDay = 21;
        int allDay = 21;
        teacher1.setSalary(salary);
        teacher1.setAllDay(allDay);
        teacher1.setK(k);
        teacher1.setWorkDay(workDay);

        double zp = salary * k * workDay / allDay;
        double teacherRez = teacher1.finalSalary();
        assertTrue("не равно",zp == teacherRez);
    }

    @Test
    public void setAge() {
//        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
//        Teacher teacher1 = new Teacher("Наждежда", "Иванова", 35, aTIvanova);
        teacher1.setAge(-50);

        assertTrue("11111",teacher1.getAge() == 35);
    }
}