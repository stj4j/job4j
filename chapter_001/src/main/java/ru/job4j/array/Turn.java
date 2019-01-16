package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int halfLength = (array.length - (array.length % 2)) / 2;
        int temp, indexFromEnd;

        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            indexFromEnd = array.length - i - 1;
            array[i] = array[indexFromEnd];
            array[indexFromEnd] = temp;
        }
        return array;
    }
}
