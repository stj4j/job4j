package ru.job4j.tracker;

public class StartUI {

    private static final int ADD = 0;
    private static final int SHOW = 1;
    private static final int EDIT = 2;
    private static final int DELETE = 3;
    private static final int FINDBYID = 4;
    private static final int FINDBYNAME = 5;
    private static final int EXIT = 6;
    private final ConsoleInput input;
    private final Tracker tracker;

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.askUser("select:")));
        } while (!"y".equals(this.input.askUser("Exit?(y): ")));
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

    public void doDefault() {
        this.input.askUser("Please select next operation : ");
    }

}
