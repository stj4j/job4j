package ru.job4j.tracker;

public class UpdateItem implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        input.showItems(tracker.findAll());
        String editID = input.askUser("Input ID for editing: ");
        Item newItem = new Item();
        newItem.setId(editID);
        newItem.setName(input.askUser("Input Name : "));
        newItem.setDescription(input.askUser("Input description"));
        input.message((tracker.replace(editID, newItem)));
    }

    @Override
    public String info() {
        return "2. Update item.";
    }
}
