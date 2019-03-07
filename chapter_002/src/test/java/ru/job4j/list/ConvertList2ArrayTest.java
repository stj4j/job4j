package ru.job4j.list;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergii on 3/6/19.
 */
public class ConvertList2ArrayTest {
    @Test
    public void convert(){
        ConvertList2Array convertList = new ConvertList2Array();
        List<int[]> data = new LinkedList<>();
        data.add(new int[]{1, 2});
        data.add(new int[]{3, 4, 5, 6});
        List<Integer> result = convertList.convert(data);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertThat(result, is(expect));
    }

    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}