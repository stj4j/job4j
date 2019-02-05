package ru.job4j.strategy;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
 @Test
   public void whenDrawSquare() {
     PrintStream stdout = System.out;
     ByteArrayOutputStream out = new ByteArrayOutputStream();
     System.setOut(new PrintStream(out));
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
     System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().paint(new Triangle());
        // проверяем результат вычисления
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
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
}

