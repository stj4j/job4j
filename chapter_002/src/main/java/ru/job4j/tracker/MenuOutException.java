package ru.job4j.tracker;

/**
 * Created by Sergii.
 */
public class MenuOutException extends RuntimeException {

    public MenuOutException(String message, Throwable e) {
        super(message, e);
        //System.out.println(message + e.getMessage());
        //System.exit(1);
        }
}


