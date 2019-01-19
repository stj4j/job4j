/**
 * @author Sergii (info@scam.ru)
 * @version $Id$
 * @since 0.1
 */


package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    /**
     *
     * @param array input array
     * @return array without duplicates
     */

    public String[] remove(String[] array) {

        int endPoint = array.length;

        for (int i = 0; i < endPoint; i++) {
            for (int j = i + 1; j < endPoint; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[endPoint - 1];
                    endPoint--;
                    j--;
                    }
                }
            }
        return Arrays.copyOf(array, endPoint);
     }
}



