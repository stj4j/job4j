package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getName() {
        Student student = new Student();
        String result = student.getName();
        assertEquals(result, "none");
    }

    @Test
    public void setName() {
        Student student = new Student();
        student.setName("Nikolay");
        String result = student.getName();
        assertEquals(result, "Nikolay");
    }
}