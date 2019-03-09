package ru.job4j.tree;

import java.util.Comparator;

/**
 * Created by Sergii.
 */
public class UserNameAndAgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        final int nameCompRez = o1.getName().compareTo(o2.getName());
        return nameCompRez != 0 ? nameCompRez : Integer.compare(o1.getAge(), o2.getAge());
    }
}
