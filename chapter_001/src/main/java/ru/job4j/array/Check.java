package ru.job4j.array;

/**
 * @author Sergii (info@scam.ru)
 * @version $Id$
 * @since 0.1
 */

public class Check {

    /**
     *
     * @param data array for check.
     * @return boolean result.
     */

    public boolean mono(boolean[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
