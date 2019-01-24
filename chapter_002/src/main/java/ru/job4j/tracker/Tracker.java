package ru.job4j.tracker;

import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;


    public Item add(Item item) {
        //item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private long generateId() {
        //Реализовать метод генерации.
        Random random = new Random();
        return random.nextLong();
    }

    public boolean replace(long id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].id == id) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].id == id) {
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    public Item[] findAll() {
        int count = items.length;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count--;
            }
        }
            if (count > 0) {
                Item[] result = new Item[count];
                for (int i = 0; i < items.length; i++) {
                    if (items[i] != null) {
                        result[(count - 1)] = items[i];
                        count--;
                    }
                    return result;
                }
            }
        return null;
    }

    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                count++;
            }
        }
            if (count > 0) {
                Item[] result = new Item[count];
                for (int i = 0; i < items.length; i++) {
                    if (items[i].getName().equals(key)) {
                        result[(count - 1)] = items[i];
                        count--;
                    }
                    return result;
                }
            }
        return null;
    }

    public Item findById(long id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].id == id) {
                return items[i];
            }
        }
        return null;
    }
}
