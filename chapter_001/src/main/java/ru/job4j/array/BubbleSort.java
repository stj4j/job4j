package ru.job4j.array;

/**
 * @author Sergii (info@scam.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    /**
     *
     * @param array for sort.
     * @return sorted array.
     */

    public int[] sort(int[] array) {
        int temp;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                }
            }
        }
    return array;
    }
}
