package test2_codegym.utils;

import java.util.regex.Pattern;

import static exam_module2.controllers.DisplayMainMenu.scanner;

public class RegexInput {
    public static final String REGEX_CODE = "^BC-[A-Z]{4}$";

    public static int returnOnlyNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format number, please re-enter");
            }
        }
    }

    public static String returnSubjectCode(){
        String code;
        while (true){
            code = scanner.nextLine();
            if (Pattern.matches(REGEX_CODE,code)){
                return code;
            }else{
                System.err.println("Wrong format subject code, please re-enter");
            }
        }
    }

}
