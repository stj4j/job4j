package ru.job4j.tree;


import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by sergii on 3/8/19.
 */
public class SortUserTest {
    @Test
    public void sort() {
        SortUser sorter = new SortUser();
        List<User> testList = new LinkedList<>();
        testList.add(new User("Igor", 44));
        testList.add(new User("Olga", 21));
        testList.add(new User("Nata", 23));
        testList.add(new User("Eva", 19));
        testList.add(new User("Greg", 34));
        testList.add(new User("Jef", 21));

        Set<User> rezult = sorter.sort(testList);
        String expect = "";
        for (User item : rezult) {
            expect += Integer.toString(item.getAge());
        }
        System.out.println(expect);
        assertTrue(expect.equals("1921233444"));
    }

    @Test
    public void sortNameLength() throws Exception {
        SortUser sorter = new SortUser();
        List<User> testList = new LinkedList<>();
        testList.add(new User("Igor", 44));
        testList.add(new User("Olga", 21));
        testList.add(new User("Natalia", 23));
        testList.add(new User("Eva", 19));
        testList.add(new User("Greg", 34));
        testList.add(new User("Jeffry", 21));

        List<User> rezult = sorter.sortNameLength(testList);
        String expect = "";
        for (User item : rezult) {
            System.out.println(item.getName());
            expect += item.getName();
        }
        System.out.println(expect);
        assertTrue(expect.equals("EvaIgorOlgaGregJeffryNatalia"));
    }

    @Test
    public void sortByAllFields() throws Exception {
        SortUser sorter = new SortUser();
        List<User> testList = new LinkedList<>();
        testList.add(new User("Jeffry", 21));
        testList.add(new User("Igor", 44));
        testList.add(new User("Olga", 21));
        testList.add(new User("Natalia", 23));
        testList.add(new User("Eva", 19));
        testList.add(new User("Igor", 22));
        List<User> rezult = sorter.sortByAllFields(testList);
        String expect = "";
        for (User item : rezult) {
            System.out.println(item.getName() + " " + item.getAge());
            expect += item.getName() + item.getAge();
        }
        System.out.println(expect);
        assertTrue(expect.equals("Eva19Igor22Igor44Jeffry21Natalia23Olga21"));
    }

}