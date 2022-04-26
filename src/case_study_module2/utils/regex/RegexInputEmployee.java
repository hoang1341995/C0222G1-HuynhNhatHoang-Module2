package case_study_module2.utils.regex;

import static case_study_module2.controllers.FuramaController.scanner;

public class RegexInputEmployee {
    public static String returnLevelEmployee(){
        while (true){
            try {
                switch (Integer.parseInt(scanner.nextLine())){
                    case 1:
                        return "Intermediate";
                    case 2:
                        return "College";
                    case 3:
                        return "Undergraduate";
                    case 4:
                        return "Graduate";
                    default:
                        System.err.println("Not on the menu, please re-enter");
                }
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
    }
    public static String returnPositonEmployee(){
        while (true){
            try {
                switch (Integer.parseInt(scanner.nextLine())){
                    case 1:
                        return "Receptionist";
                    case 2:
                        return "Server";
                    case 3:
                        return "Specialist";
                    case 4:
                        return "Supervisor";
                    case 5:
                        return "Manager";
                    case 6:
                        return "Director";
                    default:
                        System.err.println("Not on the menu, please re-enter");
                }
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
    }
}
