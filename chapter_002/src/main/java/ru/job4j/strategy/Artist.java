package ru.job4j.strategy;

public class Artist {

    public static void main(String[] args) {
        Paint pen = new Paint();
        pen.paint(new Square());
        pen.paint(new Triangle());
    }
}
