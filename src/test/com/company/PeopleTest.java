package test.com.company;

import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PeopleTest {
    Teacher teacher1;

    @Before
    public void setUp() throws Exception {
        teacher1 = new Teacher("Александра", "Тиханова", 35, "женский", new Address("Минск", "Ленина", 187, 35));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Тест окончен");
    }

    @Test
    public void getAge() {
        int age = 35;
        teacher1.setAge(age);
        assertTrue(teacher1.getAge() == age);
    }

    @Test
    public void getAgeZero() {
        int age = 0;
        teacher1.setAge(age);
        assertTrue(teacher1.getAge() == age);
    }
}
