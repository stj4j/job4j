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
        this.actions.add(new AddItem());
        this.actions.add(new ShowAllItems());
        this.actions.add(new UpdateItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindItemById());
        this.actions.add(new FindItemByName());
        this.actions.add(new ExitProgram(ui));
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
