package _19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static final String REGEX_PHONE_NUMBER = "^[(][0-9]{2}[)][-][(][0-9]{1}[0-9]{9}[)]$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number you want check: ");
        while (true){
            if (Pattern.matches(REGEX_PHONE_NUMBER,scanner.nextLine())){
                System.out.println("invalid");
                break;
            }else {
                System.err.println("not invalid");
            }
        }
    }
}
