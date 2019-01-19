package ru.job4j.array;

import org.junit.Test;

import java.util.Arrays;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Sergii (info@scam.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"1", "2", "1", "2", "3", "5", "6", "1", "2", "1", "2", "3", "8", "8", "8", "8", "8", "8" };
        String[] except = {"1", "2", "3", "6", "5", "8"};
        ArrayDuplicate testArrDup = new ArrayDuplicate();
        String[] result = testArrDup.remove(input);
        System.out.println(Arrays.toString(result));
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate6Items() {
        String[] input = {"1", "1", "2", "2", "3", "3" };
        String[] except = {"1", "2", "3"};
        ArrayDuplicate testArrDup = new ArrayDuplicate();
        String[] result = testArrDup.remove(input);
        System.out.println(Arrays.toString(result));
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateNames() {
        String[] input = {"Liza", "Olga", "Liza", "Sveta", "Valera"};
        String[] except = {"Liza", "Olga", "Sveta", "Valera"};
        ArrayDuplicate testArrDup = new ArrayDuplicate();
        String[] result = testArrDup.remove(input);
        System.out.println(Arrays.toString(result));
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
