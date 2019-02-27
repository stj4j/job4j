package ru.job4j.tracker;

import java.util.*;

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public int getActionsLentgh() {
        return this.actions.size();
    }

    public void fillActions(StartUI ui) {
        this.actions.add(new AddItem(0, "Add new Item."));
        this.actions.add(new ShowAllItems(1, "Show all items."));
        this.actions.add(new UpdateItem(2, "Update item."));
        this.actions.add(new DeleteItem(3, "Delete item."));
        this.actions.add(new FindItemById(4, "Find item by id."));
        this.actions.add(new FindItemByName(5, "Find item by name."));
        this.actions.add(new ExitProgram(ui, 6, "Exit."));
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

}
