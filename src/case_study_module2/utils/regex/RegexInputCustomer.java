package case_study_module2.utils.regex;

import static case_study_module2.controllers.FuramaController.scanner;

public class RegexInputCustomer {
    public static String returnTypeOfCustomer(){
        while (true){
            try {
                switch (Integer.parseInt(scanner.nextLine())){
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinium";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                    default:
                        System.err.println("Not on the menu, please re-enter");
                }
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
    }
}
