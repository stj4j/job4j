package ru.job4j.tracker;

public interface UserAction {

    int key();

    void execute(ConsoleInput input, Tracker tracker);

    String info();
}
