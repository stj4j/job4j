package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Created by Sergii.
 */
public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {



        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int rezult = 0;

        for (int i = 0; i < minArrayLenght(first.length, second.length); i++) {
           if (Character.compare(first[i], second[i]) != 0) {
                rezult =  Character.compare(first[i], second[i]);
                break;
            }
        }

        if (rezult == 0 && first.length != second.length) {
            rezult = first.length > second.length ? 1 : -1;
        }

        return rezult;
    }

    private int minArrayLenght(int f, int s) {
        return f > s ? s : f;
    }
}
