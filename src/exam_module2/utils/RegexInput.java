package exam_module2.utils;

import static exam_module2.controllers.DisplayMainMenu.scanner;

public class RegexInput {
    public static int returnOnlyNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format number, please re-enter");
            }
        }
    }
}
