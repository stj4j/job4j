package ru.job4j.tracker;

public class ShowAllItems extends BaseAction {

    public ShowAllItems(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        input.showItems(result);
    }
}
