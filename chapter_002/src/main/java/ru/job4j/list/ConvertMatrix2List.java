package ru.job4j.list;


import java.util.ArrayList;
import java.util.List;
/**
 * Created by Sergii.
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int size = array.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                list.add(array[i][j]);
            }
        }
       return list;
    }
}
