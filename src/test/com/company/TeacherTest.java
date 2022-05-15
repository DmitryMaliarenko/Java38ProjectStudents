package test.com.company;

import com.company.model.Address;
import com.company.model.People;
import com.company.model.Teacher;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class TeacherTest {

    Teacher ivanova;
    People pTIvanova;

    @Before
    public void setUp() throws Exception {
        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
        pTIvanova = new People("Наждежда", "Иванова", 35, aTIvanova);
        ivanova = new Teacher(pTIvanova);

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
        ivanova.setSalary(salary);
        ivanova.setAllDay(allDay);
        ivanova.setK(k);
        ivanova.setWorkDay(workDay);

        double zp = salary * k * workDay / allDay;
        double teacherRez = ivanova.finalSalary();
        assertTrue("не равно",zp == teacherRez);
    }

    @Test
    public void setAge() {
//        Address aTIvanova = new Address("Минск", "Гурской", 20, 18);
//        People pTIvanova = new People("Наждежда", "Иванова", 35, aTIvanova);
//        Teacher ivanova = new Teacher(pTIvanova);
        pTIvanova.setAge(-50);

        assertTrue("11111",pTIvanova.getAge() == 35);
    }
}