package ru.job4j.search;

import java.util.LinkedList;
/**
 * Created by Sergii.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();


    public void put(Task task) {
        int priority = task.getPriority();
        int lastPosition = tasks.size() - 1;

        if (tasks.size() == 0) {
            tasks.add(task);
        } else {
            if (tasks.get(0).getPriority() >= priority) {
                tasks.addFirst(task);
            } else {
                if (tasks.get(lastPosition).getPriority() <= priority) {
                    tasks.addLast(task);
                } else {
                    for (int i = 1; i < tasks.size() - 1; i++) {
                        if (tasks.get(i).getPriority() >= priority) {
                            tasks.add(i - 1, task);
                        }
                    }
                }

            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
