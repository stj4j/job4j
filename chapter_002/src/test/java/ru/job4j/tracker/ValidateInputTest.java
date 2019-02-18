package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * Created by Sergii.
 */
public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"-1", "-2", "a", "4"})
        );
        List<Integer> range = new ArrayList<>();
        range.add(1);
        range.add(4);
        System.out.println(input.askUser("Enter", range));
        assertThat(
                this.mem.toString(),
                is(
                        //String.format("Please enter validate data again.")
                        new StringBuilder()
                                .append("Please select key from menu." + System.lineSeparator())
                                .append("Please select key from menu." + System.lineSeparator())
                                .append("Please enter validate data again." + System.lineSeparator())
                                .append("4")
                                .append(System.lineSeparator())
                                .toString()
                        )
                );
    }
}
