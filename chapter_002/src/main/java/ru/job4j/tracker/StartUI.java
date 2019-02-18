package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {

    private static final int ADD = 0;
    private static final int SHOW = 1;
    private static final int EDIT = 2;
    private static final int DELETE = 3;
    private static final int FINDBYID = 4;
    private static final int FINDBYNAME = 5;
    private static final int EXIT = 6;
    private final ValidateInput input;
    private final Tracker tracker;
    private List<Integer> range = new ArrayList<>();

    public StartUI(ValidateInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {

      try {
            MenuTracker menu = new MenuTracker(this.input, this.tracker);
            menu.fillActions();
            for (int i = 0; i < menu.getActionsLentgh(); i++) {
              range.add(i);
            }
            do {
                menu.show();
                menu.select(Integer.valueOf(input.askUser("select:", range)));
            } while (!"y".equals(this.input.askUser("Exit?(y): ")));
       } catch (Throwable e) {
            throw new MenuOutException("Error - ", e);
       }
    }

    public static void main(String[] args) {
         new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }

    public void doDefault() {
        this.input.askUser("Please select next operation : ");
    }

}
