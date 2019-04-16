package ru.job4j;

import java.util.LinkedList;
import java.util.function.*;
import java.util.List;

/**
 * Created by Sergii.
 */
public class Calculator {
    public interface Operation {
        double calc(int left, int right);
    }

    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiple %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );
    }

    public List<Double> diapason(int start, int end,
                              Function<Double, Double> func) {
        List<Double> result = new LinkedList<>();
        for (int index = start; index < end; index++) {
            result.add(func.apply(Double.valueOf(index)));
        }
        return result;
    }
}

