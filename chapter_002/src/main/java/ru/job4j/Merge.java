package ru.job4j;

import java.util.Arrays;

/**
 * Created by Sergii.
 */
public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int count = 0;

        for(int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for(int j = 0; j < right.length;j++) {
            rsl[count++] = right[j];
        }
        Arrays.sort(rsl);
        return rsl;
    }
}
