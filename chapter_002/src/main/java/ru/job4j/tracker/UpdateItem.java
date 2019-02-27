package ru.job4j.tracker;

public class UpdateItem extends BaseAction {

    public UpdateItem(int key, String name) {
        super(key, name);
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
}
