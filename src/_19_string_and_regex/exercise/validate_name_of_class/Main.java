package _19_string_and_regex.exercise.validate_name_of_class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static final String REGEX_NAME = "^[C,A,P]{1}+[0-9]{4}+[G,H,I,K,L,M]{1}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of class you want check: ");
        while (true){
            if (Pattern.matches(REGEX_NAME,scanner.nextLine())){
                System.out.println("invalid");
                break;
            }else{
                System.err.println("not invalid");
            }
        }
    }
}
