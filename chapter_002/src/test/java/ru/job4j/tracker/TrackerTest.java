package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void deleteThanCheckResult() {
        Tracker tracker = new Tracker();
        final Item item = tracker.add(new Item("Ivan", "description"));
        Item[] items = {
                tracker.add(new Item("Vitaly", "description")),
                tracker.add(new Item("Oleg", "description")),
                tracker.add(new Item("Stas", "description")),
                tracker.add(new Item("Ivan", "description")),
                tracker.add(new Item("Olga", "description")),
        };
        tracker.delete(item.getId());
        assertThat(tracker.findAll(), is(items));
    }
}