package ru.job4j.chess;

import ru.job4j.chess.firuges.Cell;

/**
 * Created by Sergii.
 */
public abstract class Figure implements ru.job4j.chess.firuges.Figure {
    final Cell position;


    protected Figure(Cell position) {
        this.position = position;
    }

    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (source.y == dest.y + 1 && source.x == dest.x) {
            steps = new Cell[] {dest};
        }
        return steps;
    }

}
