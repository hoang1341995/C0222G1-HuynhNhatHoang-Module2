package case_study_module2.utils.regex;

import case_study_module2.utils.exception.DateTimeException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.regex.Pattern;

import static case_study_module2.controllers.FuramaController.scanner;

public class RegexInput {
    public static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    public static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    public static final String REGEX_STR = "^[A-Z]+[\\\\w]{1,}+$";

    public static String returnDate() {
        String birthDay;
        while (true){
            try {
                birthDay = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(birthDay, formatter);
                return birthDay;
            }catch (DateTimeParseException e){
                System.err.println("Wrong format date, please re-enter");
            }
        }
    }

    public static String checkAgeCustomer(){
        String birthDay;
        while (true){
            try {
                birthDay = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(birthDay, formatter);
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(testDay.getYear(), testDay.getMonth(), testDay.getDayOfMonth());
                Period period = Period.between(birthday, today);
                if (period.getYears() < 18 || period.getYears() > 100){
                    throw new DateTimeException("Customers must be over 18 years old and under 100 years old");
                }else {
                    return birthDay;
                }
            }catch (DateTimeParseException e){
                System.err.println("Wrong format date, please re-enter");
            }catch (DateTimeException e){
                System.err.println(e.getMessage());
            }

        }
    }

    public static String returnMonthAndYear(){
        String monthAndYear;
        while (true){
            try {
                monthAndYear = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
                LocalDate testDay = LocalDate.parse("01/"+monthAndYear, formatter);
                //System.out.println(testDay.format(formatter));
                return monthAndYear;
            }catch (DateTimeParseException e){
                System.err.println("Wrong format date, please re-enter. example: 01/2000");
            }
        }

    }

    public static String returnEmail() {
        String email;
        while (true) {
            email = scanner.nextLine();
            if (Pattern.matches(REGEX_EMAIL, email)) {
                return email;
            } else {
                System.err.println("Wrong format email, please re-enter");
            }
        }
    }

    public static String returnPhoneNumber() {
        String phoneNumber;
        while (true) {
            phoneNumber = scanner.nextLine();
          if (Pattern.matches(REGEX_PHONE_NUMBER,phoneNumber)){
                return phoneNumber;
            } else {
                System.err.println("Wrong format phone number, please re-enter");
            }
        }
    }

    public static String returnGender() {
        while (true) {
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        return "Male";
                    case 2:
                        return "Female";
                    default:
                        System.err.println("Not on the menu, please re-enter");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, please re-enter");
            }
        }
    }

    public static String returnIdFacility(String nameService) {
        while (true){
            String id = scanner.nextLine();
            if (nameService.equals("villa") && Pattern.matches(ID_VILLA,id)) {
                return id;
            } else if (nameService.equals("house") && Pattern.matches(ID_HOUSE,id)) {
                return id;
            }else if (nameService.equals("room") && Pattern.matches(ID_ROOM,id)) {
                return id;
            }else {
                System.err.println("Wrong format id facility");
            }
        }
    }

    public static int returnOnlyNumber() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Wrong format number, please re-enter");
            }
        }
    }

    public static int returnId(String path){
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int max = 0;
            String[] elements;
            while ((line = bufferedReader.readLine()) != null) {
                elements = line.split(",");
                if (max < Integer.parseInt(elements[0])) max = Integer.parseInt(elements[0]);
            }
            bufferedReader.close();
            return ++max;
        } catch (Exception e) {
            System.err.println("[returnIdBooking] File not found");
        }
        return 1;
    }

    public static String returnString(){
        String str;
        while (true){
            str = scanner.nextLine();
//            if (Pattern.matches(REGEX_STR,str)){
//                return str;
//            }else{
//                System.err.println("Wrong format name, re-enter");
//            }
            return str;
        }
    }

    public static int returnPositiveNumber(){
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor >0){
                    return floor;
                }else{
                    System.err.println("Wrong, must be greater than 0 , please re-enter");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong, must be greater than 0 , please re-enter");
            }
        }
    }

    public static int returnMaxPeople(){
        int maxPeople;
        while (true) {
            try {
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople > 0 && maxPeople <= 20){
                    return maxPeople;
                }else{
                    System.err.println("Wrong format max people, max 20 people , please re-enter");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format max people, please re-enter");
            }
        }
    }

    public static int returnPoolArea(){
        int poolArea;
        while (true) {
            try {
                poolArea = Integer.parseInt(scanner.nextLine());
                if (poolArea > 30 ){
                    return poolArea;
                }else{
                    System.err.println("Wrong, the area must be more than 30m2 , please re-enter");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong, the area must be more than 30m2, please re-enter");
            }
        }
    }


}
