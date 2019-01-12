package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    /**
     *
     * @param x value
     * @param y value
     */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    /**
     *
     * @param that point
     * @return double
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }


}