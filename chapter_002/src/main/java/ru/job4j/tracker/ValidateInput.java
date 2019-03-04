package ru.job4j.tracker;

import java.util.List;

/**
 * Created by Sergii.
 */
public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String askUser(String question) {
        return this.input.askUser(question);
    }


    public int askUser(String askMessage, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.askUser(askMessage, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return  value;
    }

    @Override
    public void message(String message) {
        this.input.message(message);
    }

    @Override
    public void showItem(Item item) {
        try {
            this.input.showItem(item);
        } catch (NullPointerException e) {
            message("----------" + System.lineSeparator()
                    + "| No record for this ID." + System.lineSeparator()
                    + "----------");
        }
    }

    @Override
    public void showItems(Item[] items) {
        this.input.showItems(items);
    }

    @Override
    public void message(boolean in) {
        this.input.message(in);
    }

}
