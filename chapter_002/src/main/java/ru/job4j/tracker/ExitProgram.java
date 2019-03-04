package ru.job4j.tracker;

public class ExitProgram extends BaseAction {
    private StartUI ui;

    ExitProgram(StartUI ui, int key, String name) {
        super(key, name);
        this.ui = ui;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        this.ui.setMenuLoop(false);
    }
}
