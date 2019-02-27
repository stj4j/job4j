package ru.job4j.tracker;

public class FindItemByName extends BaseAction {

    public FindItemByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String findName = input.askUser("Input Name: ");
        input.showItems(tracker.findByName(findName));
    }
}
