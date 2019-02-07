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
        ConsoleInput input = new StubInput(new String[] {"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("--------------------\n")
                                .append("ID from record is : " + result[0].getId() + "\n")
                                .append("Name is: " + result[0].getName() + "\n")
                                .append("Description from record is : " + result[0].getDescription() + "\n")
                                .append("--------------------\n")
                                .append("--------------------\n")
                                .append("ID from record is : " + result[1].getId() + "\n")
                                .append("Name is: " + result[1].getName() + "\n")
                                .append("Description from record is : " + result[0].getDescription() + "\n")
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
        ConsoleInput input = new StubInput(new String[]{"4", result[0].getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("--------------------\n")
                                .append("ID from record is : " + result[0].getId() + "\n")
                                .append("Name is: " + result[0].getName() + "\n")
                                .append("Description from record is : " + result[0].getDescription() + "\n")
                                .append("--------------------")
                                .append(System.lineSeparator())
                                .toString()

                )
        );
    }
}
