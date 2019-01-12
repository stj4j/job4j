package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTo() {
    Point testPoint = new Point(8,8);
    Point testPointThat = new Point(20,20);
    Double result = testPoint.distanceTo(testPointThat);
    assertThat(result, closeTo(16.9, 0.1));
    }
}