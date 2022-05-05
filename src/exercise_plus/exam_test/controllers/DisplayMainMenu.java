package exercise_plus.exam_test.controllers;

import java.util.Scanner;

import static exam_module2.utils.RegexInput.returnOnlyNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Exit");

            switch (returnOnlyNumber()){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
}
