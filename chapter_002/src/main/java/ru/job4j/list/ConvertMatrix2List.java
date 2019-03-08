package ru.job4j.list;


import java.util.ArrayList;
import java.util.List;
/**
 * Created by Sergii.
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int[] itemRow : array) {
            for (int item : itemRow) {
                list.add(item);
            }
        }
       return list;
    }
}
