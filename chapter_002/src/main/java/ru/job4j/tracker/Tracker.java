package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;


    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        //Реализовать метод генерации.
        Random random = new Random();
        return String.valueOf(random.nextLong());
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, position - i - 1);
                items[position] = null;
                position--;
                result = true;
                break;
                }
            }
        return result;
    }

    public Item[] findAll() {
       return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[position];
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                result[count++] = items[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }
}
