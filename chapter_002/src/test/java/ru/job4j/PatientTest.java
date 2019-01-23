package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {

    @Test
    public void getName() {
        Patient patient = new Patient();
        String result = patient.getName();
        assertEquals(result, "none");
    }

    @Test
    public void setName() {
        Patient patient = new Patient();
        patient.setName("Egor");
        String result = patient.getName();
        assertEquals(result, "Egor");
    }
}