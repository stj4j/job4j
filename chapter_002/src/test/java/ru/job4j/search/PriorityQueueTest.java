package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergii on 3/6/19.
 */
public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenOneItem() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("urgent", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

}