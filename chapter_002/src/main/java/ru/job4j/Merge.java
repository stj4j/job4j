package ru.job4j;
/**
 * Created by Sergii.
 */
public class Merge {

    public int[] merge(int[] left, int[] right) {
        int newarraysize = left.length + right.length;
        int[] rsl = new int[newarraysize];
        int i = 0;
        int leftindex = 0;
        int rightindex = 0;

        while (i < newarraysize) {
            if ((leftindex < left.length) && (rightindex < right.length)) {
                if (left[leftindex] < right[rightindex]) {
                    rsl[i] = left[leftindex];
                    i++;
                    leftindex++;
                } else {
                    rsl[i] = right[rightindex];
                    i++;
                    rightindex++;
                }
            } else {
                if (leftindex >= left.length) {
                    while (rightindex < right.length) {
                        rsl[i] = right[rightindex];
                        i++;
                        rightindex++;
                    }
                }
                if (rightindex >= right.length) {
                    while (leftindex < left.length) {
                        rsl[i] = left[leftindex];
                        leftindex++;
                        i++;
                    }
                }
            }

        }
    return rsl;
    }
}
