package test_job.controllers;

import test_job.services.implement.JobImpl;

import java.util.Scanner;

import static exam_module2.utils.RegexInput.returnOnlyNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static JobImpl job = new JobImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. Display by priority ");
            System.out.println("2. Display by week");
            System.out.println("3. Add new job ");
            System.out.println("4. Update job");
            System.out.println("0. Exit");

            switch (returnOnlyNumber()){
                case 1:
                    job.displayByPriority();
                    break;
                case 2:
                    job.displayByWeek();
                    break;
                case 3:
                    job.addNew();
                    break;
                case 4:
                    job.update();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
}
