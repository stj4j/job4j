package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String delId = input.askUser("Input ID : ");
        input.message(tracker.delete(delId));
    }

    @Override
    public String info() {
        return "3. Delete item.";
    }

}
