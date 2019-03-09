package ru.job4j.tree;

import java.util.*;

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

    public List<User> sortNameLength(List<User> list) {
        List<User> result = new LinkedList<>();
        Collections.sort(list, new UserLangthComparator());
        for (User item : list) {
            result.add(item);
        }
        return result;
    }

    public List<User> sortByAllFields(List<User> list) {
        List<User> result = new LinkedList<>();
        Collections.sort(list, new UserNameAndAgeComparator());
        for (User item : list) {
            result.add(item);
        }
        return result;
    }
}
