package backup_exam_module2.exam_module2.controllers;

import exam_module2.services.implement.CustomerImpl;

import java.util.Scanner;

import static exam_module2.utils.regex.Regex.regexNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static CustomerImpl customer = new CustomerImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. show");
            System.out.println("2. add new");
            System.out.println("3. edit");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Exit");

            switch (regexNumber()){
                case 1:
                    customer.display();
                    break;
                case 2:
                    customer.addNew();
                    break;
                case 3:
                    customer.edit();
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

    public static void addNew(){  ///menu phụ
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Exit");

            switch (regexNumber()){
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
