package ru.job4j.list;

import java.util.List;

/**
 * Created by Sergii.
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cellsDelta = list.size() % rows;
        int cells = list.size() / rows + cellsDelta;
        int[][] array = new int[rows][cells];
        int startPosition, position;

        for (int i = 0; i <= rows - 1; i++) {
            startPosition = i * cells;
            for (int j = 0; j <= cells - 1; j++) {
                position = startPosition + j;
                if (position < list.size()) {
                    array[i][j] = list.get(position);
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
