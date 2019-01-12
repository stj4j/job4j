package ru.job4j.calculator;

public class Calculator {
    private double result;

    /**
     *
     * @param first number
     * @param second number
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     *
     * @param first number
     * @param second number
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     *
     * @param first number
     * @param second number
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     *
     * @param first number
     * @param second number
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }





    /**
     *
     * @return value double
     */

    public double getResult() {
        return this.result;
    }
}
