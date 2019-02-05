package ru.job4j.strategy;

public class Paint {
    private Shape pen;

    public void paint(Shape strategy) {
        this.pen = strategy;
        pen.draw();
    }
}
