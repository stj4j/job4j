package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial testFactorial = new Factorial();
        int result = testFactorial.calc(5);
        assertThat(result, is(120));

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial testFactorial = new Factorial();
        int result = testFactorial.calc(0);
        assertThat(result, is(1));
    }

}
