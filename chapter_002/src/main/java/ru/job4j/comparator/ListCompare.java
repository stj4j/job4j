package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Created by Sergii.
 */
public class ListCompare implements Comparator<String> {

    // ascii A-Z 65-90
    // ascii a-z 97-122

    @Override
    public int compare(String o1, String o2) {



        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int rezult = 0;

        for (int i = 0; i < minArrayLenght(first.length, second.length) - 1; i++) {
            if ((int) first[i] > (int) second[i]) {
                rezult = 1;
                break;
            }
            if ((int) first[i] < (int) second[i]) {
                rezult = -1;
                break;
            }
        }

        if (rezult == 0 && first.length != second.length) {
            rezult = first.length > second.length ? 1 : -1;
        }

        return rezult;
    }

    private int minArrayLenght(int f, int s) {
        return f > s ? f : s;
    }
}
