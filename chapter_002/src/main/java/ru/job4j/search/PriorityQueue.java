package ru.job4j.search;

import java.util.LinkedList;
/**
 * Created by Sergii.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();


    public void put(Task task) {
        int index = tasks.size();
        for (int i = 0; i < index; i++) {
            if (tasks.get(i).getPriority() >= task.getPriority()) {
                index = i;
                break;
            }
        }
        tasks.add(index, task);
    }

    public Task take() {
        return this.tasks.poll();
    }

}
