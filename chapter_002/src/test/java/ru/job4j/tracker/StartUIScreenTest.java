package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUIScreenTest {

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
    public void showAllOutCheck() {
        Tracker tracker = new Tracker();
        Item[] result = {
                tracker.add(new Item("Ivan", "desc")),
                tracker.add(new Item("Nik", "desc"))};
        ValidateInput input = new StubInput(new String[] {"1", "y"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("0. Add new Item." + System.lineSeparator())
                                .append("1. Show all items." + System.lineSeparator())
                                .append("2. Update item." + System.lineSeparator())
                                .append("3. Delete item." + System.lineSeparator())
                                .append("4. Find item by id." + System.lineSeparator())
                                .append("5. Find item by name." + System.lineSeparator())
                                .append("6. Exit." + System.lineSeparator())
                                .append("--------------------" + System.lineSeparator())
                                .append("ID from record is : " + result[0].getId() + System.lineSeparator())
                                .append("Name is: " + result[0].getName() + System.lineSeparator())
                                .append("Description from record is : " + result[0].getDescription() + System.lineSeparator())
                                .append("--------------------" + System.lineSeparator())
                                .append("--------------------" + System.lineSeparator())
                                .append("ID from record is : " + result[1].getId() + System.lineSeparator())
                                .append("Name is: " + result[1].getName() + System.lineSeparator())
                                .append("Description from record is : " + result[0].getDescription() + System.lineSeparator())
                                .append("--------------------")
                                .append(System.lineSeparator())
                                .toString()
                )
        );

    }


    @Test
    public void findByIdOutCheck() {
        Tracker tracker = new Tracker();
        Item[] result = {
                tracker.add(new Item("Ivan", "desc")),
                tracker.add(new Item("Nik", "desc"))};
        ValidateInput input = new StubInput(new String[]{"4", result[0].getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("0. Add new Item." + System.lineSeparator())
                                .append("1. Show all items." + System.lineSeparator())
                                .append("2. Update item." + System.lineSeparator())
                                .append("3. Delete item." + System.lineSeparator())
                                .append("4. Find item by id." + System.lineSeparator())
                                .append("5. Find item by name." + System.lineSeparator())
                                .append("6. Exit." + System.lineSeparator())
                                .append("--------------------" + System.lineSeparator())
                                .append("ID from record is : " + result[0].getId() + System.lineSeparator())
                                .append("Name is: " + result[0].getName() + System.lineSeparator())
                                .append("Description from record is : " + result[0].getDescription() + System.lineSeparator())
                                .append("--------------------")
                                .append(System.lineSeparator())
                                .toString()

                )
        );
    }
}
