package ru.job4j.tree;

import java.util.Comparator;

/**
 * Created by Sergii.
 */
public class UserLangthComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getName().length() >= o2.getName().length() ? 1 : -1;
    }
}

