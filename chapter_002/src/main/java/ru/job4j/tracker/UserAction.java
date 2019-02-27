package ru.job4j.tracker;

public interface UserAction {

    int key(int key, String name);

    void execute(Input input, Tracker tracker);

    String info();
}
