package test2_codegym.controllers;

import test2_codegym.services.implement.SubjectImpl;

import java.util.Scanner;

import static exam_module2.utils.RegexInput.returnOnlyNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static SubjectImpl subject = new SubjectImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. Display subjects list");
            System.out.println("2. Add new subject");
            System.out.println("3. Update subject");
            System.out.println("4. Remove subject");
            System.out.println("0. Exit");

            switch (returnOnlyNumber()){
                case 1:
                    subject.display();
                    break;
                case 2:
                    subject.addNew();
                    break;
                case 3:
                    subject.edit();
                    break;
                case 4:
                    subject.delete();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
}
