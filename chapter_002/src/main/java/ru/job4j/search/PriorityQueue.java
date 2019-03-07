package ru.job4j.search;

import java.util.LinkedList;
/**
 * Created by Sergii.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {

        if (task.getPriority() == 1) {
            tasks.addFirst(task);
        }
        if (task.getPriority() > tasks.size()) {
            this.tasks.add(task);
        } else {
            this.tasks.add(task.getPriority(), task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
