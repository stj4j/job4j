package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Sergii.
 */
public class ValidateInput extends ConsoleInput {

    public String askUser(String message, List<Integer> range) {
        int input;
        boolean parseSuccess;
        int menuSize = range.size() - 1;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                input = Integer.parseInt(scanner.next());
                if (input >=0 && input < range.size()) return String.valueOf(input);
                message("Please input number from 0 to " + menuSize + ".");
                parseSuccess = false;
            } catch (NumberFormatException e) {
                message("Please input number from 0 to " + menuSize + ".");
                parseSuccess = false;
            }
        } while (parseSuccess == false );
        System.out.println("You out of valid range. Try one more time.");
        return askUser(message, range);
    }
}
