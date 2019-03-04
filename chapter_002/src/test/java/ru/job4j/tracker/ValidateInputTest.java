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

    @Test
    public void showItemWithBadId() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"4", "fghfghfghfg", "6"})
        );
        Tracker tracker = new Tracker();
        StartUI start = new StartUI(input, tracker);
        start.init();

        assertThat(
                this.mem.toString(),
                is(
                        //String.format("Please enter validate data again.")
                        new StringBuilder()
                                .append("0. Add new Item." + System.lineSeparator())
                                .append("1. Show all items." + System.lineSeparator())
                                .append("2. Update item." + System.lineSeparator())
                                .append("3. Delete item." + System.lineSeparator())
                                .append("4. Find item by id." + System.lineSeparator())
                                .append("5. Find item by name." + System.lineSeparator())
                                .append("6. Exit." + System.lineSeparator())
                                .append("--------------------" + System.lineSeparator())
                                .append("----------" + System.lineSeparator())
                                .append("| No record for this ID." + System.lineSeparator())
                                .append("----------" + System.lineSeparator())
                                .append("0. Add new Item." + System.lineSeparator())
                                .append("1. Show all items." + System.lineSeparator())
                                .append("2. Update item." + System.lineSeparator())
                                .append("3. Delete item." + System.lineSeparator())
                                .append("4. Find item by id." + System.lineSeparator())
                                .append("5. Find item by name." + System.lineSeparator())
                                .append("6. Exit.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
