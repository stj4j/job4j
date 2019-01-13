package ru.job4j.max;

public class Max {


    /**
     *
     * @param first number
     * @param second number
     * @return integer
     */
    public int max(int first, int second) {
        return first < second ? second : first;
    }

    /**
     *
     * @param first number
     * @param second number
     * @param third number
     * @return integer
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
