package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CpunterTest {

        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
          Counter testCounter = new Counter();
          int result = testCounter.add(1, 10);
          assertThat(result, is(30));
        }

}
