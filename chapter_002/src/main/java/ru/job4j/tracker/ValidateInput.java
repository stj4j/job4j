package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

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

    public String askUser(String askMessage, List<Integer> range) {
        int input = -1;
        boolean invalid = true;
        int menuSize = range.size() - 1;
        do {
            try {
                input = Integer.valueOf(this.input.askUser(askMessage));
                for (int element : range) {
                  if (input == element) {
                      return  String.valueOf(input);
                  }
                }
                System.out.println("Please select key from menu.");
                invalid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return  String.valueOf(input);
    }

    @Override
    public void message(String message) {
        this.input.message(message);
    }

    @Override
    public void showItem(Item item) {
        this.input.showItem(item);
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
