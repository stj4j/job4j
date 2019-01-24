package ru.job4j.tracker;


import java.text.SimpleDateFormat;

public class Item {
    long id;
    String name;
    String description;
    SimpleDateFormat createdOnDate;
    String comments;

    Item() {

    }

    Item(String name, String description, Long id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


