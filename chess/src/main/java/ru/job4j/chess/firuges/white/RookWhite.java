package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class RookWhite implements Figure {
    private final Cell position;

    public RookWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (dest.y == source.y || dest.x == source.x) {
            steps = new Cell[] {dest};
        } else {
            steps = new Cell[] {source};
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}
