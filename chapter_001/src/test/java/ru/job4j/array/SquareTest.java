package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

        @Test
        public void whenBound3Then149() {
            int bound = 3;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9};
            assertThat(rst, is(expect));
        }
        @Test
            public void whenBound7Then1234567() {
            int bound = 7;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49};
            assertThat(rst, is(expect));
        }
        @Test
            public void whenBound9Then123456789() {
            int bound = 9;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49, 64, 81};
            assertThat(rst, is(expect));
        }
}
