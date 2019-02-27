package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String delId = input.askUser("Input ID : ");
        input.message(tracker.delete(delId));
    }
}
