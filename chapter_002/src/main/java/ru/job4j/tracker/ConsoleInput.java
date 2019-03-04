package ru.job4j.tracker;


import java.util.Scanner;
import java.util.List;

public class ConsoleInput implements Input {

    public String askUser(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int askUser(String question, List<Integer> range) {
        int input = -1;
        boolean invalid = false;
        do {
                input = Integer.valueOf(this.askUser(question));
                if (!this.checkValue(range, input)) {
                    System.out.println("Please select key from menu.");
                    invalid = true;
                }
        } while (invalid);
        return  input;
    }

    public void printMenu() {
        System.out.print(
                "0. Add new Item\n"
                        + "1. Show all items\n"
                        + "2. Edit item\n"
                        + "3. Delete item\n"
                        + "4. Find item by Id\n"
                        + "5. Find items by name\n"
                        + "6. Exit Program\n"
                        + "Select:");

    }

    public void showItem(Item item) {
        System.out.println("--------------------");
        System.out.println("ID from record is : " + item.getId());
        System.out.println("Name is: " + item.getName());
        System.out.println("Description from record is : " + item.getDescription());
        System.out.println("--------------------");
    }

    public void showItems(Item[] items) {
        for (Item item : items) {
            showItem(item);
        }
    }

    public void message(String message) {
        System.out.println(message);
    }

    public void message(boolean in) {
        if (in) {
            System.out.println("Operation done.");
        } else {
            System.out.println("Not found");
        }
    }

    private boolean checkValue(List<Integer> range, int input) {
        for (int element : range) {
            if (input == element) {
                return true;
            }
        }
        return false;
    }

}
