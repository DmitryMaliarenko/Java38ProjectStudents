package test.com.company;

import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.repository.GroupRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupTest {

    List<Group> groups;
    List<Group> groupList;
    Group group1;
    Group group2;
    Group group3;
    ArrayList<Student> students1;
    ArrayList<Student> students2;
    ArrayList<Student> students3;
    Teacher teacher2;
    Teacher teacher3;
    Teacher teacher4;
    GroupRepository groupRepository = new GroupRepository();

    @Before
    public void setUp() throws Exception {

        group1 = new Group(1, 1, teacher2, students1, 2021, 2026);
        group2 = new Group(2, 1, teacher3, students2, 2020, 2025);
        group3 = new Group(3, 1, teacher4, students3, 2019, 2024);
        groups = new ArrayList<>() {{
            add(group1);
            add(group2);
        }};
        groupList = groups;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Тест завершен");
    }

    @Test
    public void addGroups() {
        int size = 3;
        groupList.add(group3);
        groupRepository.addGroups(groupList);
        assertTrue(size == groupList.size());
    }

    @Test
    public void removeGroups() {
        int size = 2;
        groupList.remove(group1);
        groupRepository.removeGroups(groupList);
        assertTrue(size == groupList.size());

    }

    @Test
    public void changeGroup() {
        int index = 1;
        Group groupChange = new Group(4, 1, teacher3, students2, 2018, 2023);
        int groupName = 2;
        groups.set(index, groupChange);
        for (Group n : groupList) {
            if (groupName == n.getGroupName()) {
                index = groupList.indexOf(n);
            }
        }
        groupList.set(index, groupChange);
        groupRepository.setGroups(groupList);
        assertEquals(groups, groupList);
    }
}
