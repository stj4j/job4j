package ru.job4j.tracker;

import java.util.List;

/**
 * Created by sergii on 2/17/19.
 */
public interface Input {

    String askUser(String question);
    int askUser(String question, List<Integer> range);
    void message(String message);
    void showItem(Item item);
    void showItems(Item[] items);
    void message(boolean in);

}
