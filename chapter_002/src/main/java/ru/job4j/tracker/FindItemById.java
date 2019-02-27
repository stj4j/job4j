package ru.job4j.tracker;

public class FindItemById extends BaseAction {

    public FindItemById(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.askUser("Input ID : ");
        input.showItem(tracker.findById(id));
    }
}
