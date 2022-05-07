package test_job.utils;

import test_job.models.Job;

import java.util.List;
import java.util.regex.Pattern;

import static exam_module2.controllers.DisplayMainMenu.scanner;
import static test_job.services.implement.JobImpl.getJobList;

public class RegexInput {
    static List<Job> jobList = getJobList();
    public static final String REGEX_CODEJOB = "^TASK-[0-9]{4}$";
    public static int returnOnlyNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format number, please re-enter");
            }
        }
    }

    public static String choosePriority() {
        while (true) {
            System.out.println("1. High\n2. Normal\n3. Low");
            switch (returnOnlyNumber()) {
                case 1:
                    return "High";
                case 2:
                    return "High";
                case 3:
                    return "High";
                default:
                    System.err.println("Number not on the menu, please re-enter");
            }
        }
    }

    public static String chooseDayOfWeek() {
        while (true) {
            System.out.println("1. Sunday\n" +
                    "2. Monday\n" +
                    "3. Tuesday\n" +
                    "4. Wednesday\n" +
                    "5. Thursday\n" +
                    "6. Friday\n" +
                    "7. Saturday\n");
            switch (returnOnlyNumber()) {
                case 1:
                    return "Sunday";
                case 2:
                    return "Monday";
                case 3:
                    return "Tuesday";
                case 4:
                    return "Wednesday";
                case 5:
                    return "Thursday";
                case 6:
                    return "Friday";
                case 7:
                    return "Saturday";
                default:
                    System.err.println("Number not on the menu, please re-enter");
            }
        }
    }

    public static String formatCodeJob(){
        jobList = getJobList();
        String codeJob;
        while (true){
            codeJob = scanner.nextLine();
            if (Pattern.matches(REGEX_CODEJOB,codeJob)){
                for (Job list : jobList){
                    if (list.getCodeJob().equals(codeJob)){
                        System.err.println("Code job already exists");
                    }else {
                        return codeJob;
                    }
                }
            }else {
                System.err.println("Code job wrong format, please re-enter");
            }
        }
    }

}
