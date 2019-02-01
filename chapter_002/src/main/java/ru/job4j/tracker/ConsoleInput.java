package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput {

    public String askUser(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
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
        for (int j = 0; j < items.length; j++) {
            showItem(items[j]);
        }
    }

}
