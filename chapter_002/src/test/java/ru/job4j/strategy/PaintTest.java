package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

   @Test
   public void whenDrawSquare() {
     new Paint().paint(new Square());
     assertThat(
             new String(out.toByteArray()),
             is(
                     new StringBuilder()
                             .append("HHHHHHH\n")
                             .append("H     H\n")
                             .append("H     H\n")
                             .append("H     H\n")
                             .append("HHHHHHH")
                             .append(System.lineSeparator())
                             .toString()
             )
     );
   }

    @Test
    public void whenDrawTriangle() {
        new Paint().paint(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("    A\n")
                                .append("   AAA\n")
                                .append("  AAAAA\n")
                                .append(" AAAAAAA\n")
                                .append("AAAAAAAAA")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}

