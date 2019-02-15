package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(ConsoleInput input, Tracker tracker) {
        String id = input.askUser("Input ID : ");
        input.showItem(tracker.findById(id));
    }

    @Override
    public String info() {
        return "4. Find item by id.";
    }
}
