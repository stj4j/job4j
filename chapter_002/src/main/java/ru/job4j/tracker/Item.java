package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;
    private String description;
    private Long createdOnDate;
    private String comments;

    Item() {

    }

    Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdOnDate = System.currentTimeMillis();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(Long createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}


