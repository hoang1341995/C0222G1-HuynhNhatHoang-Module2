package case_study_module2.utils.regex;

import java.util.regex.Pattern;

import static case_study_module2.controllers.FuramaController.scanner;

public class RegexInput {
    public static final String REGEX_BIRTHDAY = "^(((0[1-9]|1[012])\\\\/(?!00|29)([012]\\\\d)|(0[13-9]|1[012])\\\\/(29|30)|(0[13578]|1[02])\\\\/31)\\\\/(18|19|20)\\\\d{2}|02\\\\/29\\\\/((18|19|20)(0[48]|[2468][048]|[13579][26])|2000))$";
    public static final String REGEX_PHONE_NUMBER = "^(0|\\\\+84)(\\\\s|\\\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\\\d)(\\\\s|\\\\.)?(\\\\d{3})(\\\\s|\\\\.)?(\\\\d{3})$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";

    public static String returnBirthDay(){
        String birthDay;
        while (true){
            birthDay = scanner.nextLine();
//            if (Pattern.matches(REGEX_BIRTHDAY,birthDay)){
            if (true){
                return birthDay;
            }else {
                System.out.println(birthDay);
                System.err.println("Wrong format birthday, please re-enter");
            }
        }
    }

    public static String returnEmail(){
        String email;
        while (true){
            email = scanner.nextLine();
            if (Pattern.matches(REGEX_EMAIL,email)){
                return email;
            }else {
                System.err.println("Wrong format email, please re-enter");
            }
        }
    }

    public static String returnPhoneNumber(){
        String phoneNumber;
        while (true){
            phoneNumber = scanner.nextLine();
//            if (Pattern.matches(REGEX_PHONE_NUMBER,phoneNumber)){
            if (true){
                return phoneNumber;
            }else {
                System.err.println("Wrong format phone number, please re-enter");
            }
        }
    }
    public static String returnGender(){
        while (true){
            try {
                switch (Integer.parseInt(scanner.nextLine())){
                    case 1:
                        return "Male";
                    case 2:
                        return "Female";
                    default:
                        System.err.println("Not on the menu, please re-enter");
                }
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
    }


}
