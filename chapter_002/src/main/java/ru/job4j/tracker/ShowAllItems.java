package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(ConsoleInput input, Tracker tracker) {
        Item[] result = tracker.findAll();
        input.showItems(result);
    }

    @Override
    public String info() {
        return "1. Show all items.";
    }
}
