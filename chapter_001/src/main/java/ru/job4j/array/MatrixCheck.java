package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        int indexFromEnd = data.length - 1;

        for (int i = 0; i < indexFromEnd; i++) {
            // Первая диагональ.
            if (data[i][i] != data[i + 1][i + 1]) {
                return false;
            }
            // Вторая диагональ
            if (data[i][indexFromEnd] != data[i][indexFromEnd - i]) {
                return false;
            }
        }
        return true;
    }
}
