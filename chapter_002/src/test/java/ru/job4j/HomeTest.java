package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeTest {

    @Test
    public void getType() {
        Home home = new Home();
        String result = home.getType();
        assertEquals(result, "none");
    }

    @Test
    public void setType() {
        Home home = new Home();
        home.setType("Skyscraper");
        String result = home.getType();
        assertEquals(result, "Skyscraper");
    }
}