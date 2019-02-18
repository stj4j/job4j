package ru.job4j.tracker;

public class FindItemByName implements UserAction {
    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String findName = input.askUser("Input Name: ");
        input.showItems(tracker.findByName(findName));
    }

    @Override
    public String info() {
        return "5. Find item by name.";
    }
}
