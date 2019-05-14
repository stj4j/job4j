package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;


public class CashMachine {

    private final int[] values;
    private IntFunction way;

    public CashMachine(final int[] values) {
        this.values = values;
        if (this.values[0] > this.values[1]) {
          this.way = x  ->   (this.values.length - 1 - x);
        } else {
          this.way = x  ->   (x);
        }
        Arrays.sort(this.values);

    }

    public List<List<Integer>> exchange(int note) {
        return exchange(note, this.values[this.values.length - 1], way);
    }

    private List<List<Integer>> exchange(int note, int maxCoin, IntFunction way) {
        List<List<Integer>> result = new ArrayList<>();
        if (note == 0) {
            result.add(new ArrayList<>());
        } else {
            for (int i = 0; i < this.values.length; i++) {
                int coin = values[(int) way.apply(i)];
                if (coin > note || coin > maxCoin) {
                    continue;
                }
                for (List<Integer> remain : exchange(note - coin, coin, way)) {
                    List<Integer> set = new ArrayList<>();
                    set.addAll(remain);
                    set.add(coin);
                    result.add(set);
                }
            }
        }
        return result;
    }
}
