package ru.job4j.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sergii.
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cellsDelta = list.size() % rows;
        int cells = list.size() / rows + cellsDelta;
        int[][] array = new int[rows][cells];
        int i = 0, j = 0;

        for (int item : list) {
            array[i][j] = item;
            j++;
            if (j == cells) {
               i++;
               j = 0;
            }
        }
        return array;
    }
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new LinkedList<>();
        int arraySize;


        for (int[] itemsArray : list) {
            for (int item : itemsArray) {
                result.add(item);
            }
        }
    return result;
    }
}
