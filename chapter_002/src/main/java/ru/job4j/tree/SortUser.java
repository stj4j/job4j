package ru.job4j.tree;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sergii.
 */
public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> result = new TreeSet<>();
        Collections.sort(list);
        for (User item : list) {
            result.add(item);
        }
        return result;
    }
}
