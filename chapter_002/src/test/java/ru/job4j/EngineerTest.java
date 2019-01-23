package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineerTest {

    @Test
    public void toBuild() {
        Home building = new Home();
        Engineer igor = new Engineer();
        Home result = igor.toBuild(building);
        assertEquals(result.getType(), "none");
    }
}