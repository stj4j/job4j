package ru.job4j.tracker;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.*;

public class StartUITest {

    // menu 0 add
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        ConsoleInput input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        Assert.assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    // menu 1 showAll
    @Test
    public void showAllCheck() {
        Tracker tracker = new Tracker();
        ConsoleInput input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        Item[] items = {
                tracker.add(new Item("Name 1", "desc")),
                tracker.add(new Item("Name 2", "desc")),
                tracker.add(new Item("Name 3", "desc"))
        };
        Assert.assertThat(tracker.findAll(), is(items));
    }

    // menu 2 edit
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        ConsoleInput input = new StubInput(new String[]{"2", item.getId(), "test replace", "description", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        Assert.assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    // menu 3 delete
    @Test
    public void deleteCheck() {
        Tracker tracker = new Tracker();
        ConsoleInput input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        Item[] items = {
                tracker.add(new Item("Name 1", "desc")),
                tracker.add(new Item("Name 2", "desc")),
                tracker.add(new Item("Name 3", "desc"))
        };
        tracker.delete(items[2].getId());
        items = Arrays.copyOf(items, 2);
        Assert.assertThat(tracker.findAll(), is(items));
    }


    // menu 4
    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item[] items = {
                tracker.add(new Item("Name 3", "desc"))
        };
        ConsoleInput input = new StubInput(new String[]{"4", items[0].getId(), "6"});
        new StartUI(input, tracker).init();
        Assert.assertThat(tracker.findById(items[0].getId()), is(items[0]));
    }

    // menu 5
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item[] items = {
                tracker.add(new Item("Name 3", "desc")),
                tracker.add(new Item("Name 3", "desc"))
        };
        ConsoleInput input = new StubInput(new String[]{"5", items[0].getName(), "6"});
        new StartUI(input, tracker).init();
        Assert.assertThat(tracker.findByName(items[0].getName()), is(items));
    }


}
