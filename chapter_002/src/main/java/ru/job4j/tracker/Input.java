package ru.job4j.tracker;

/**
 * Created by sergii on 2/17/19.
 */
public interface Input {

    String askUser(String question);
    void message(String message);
    void showItem(Item item);
    void showItems(Item[] items);
    void message(boolean in);

}
