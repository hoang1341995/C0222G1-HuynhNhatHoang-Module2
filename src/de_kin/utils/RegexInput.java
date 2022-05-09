package de_kin.utils;

import case_study_module2.controllers.FuramaController;
import case_study_module2.utils.exception.DateTimeException;
import de_kin.models.person.Customer;
import de_kin.services.implement.CustomerImpl;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static de_kin.controllers.DisplayMainMenu.customerImpl;
import static de_kin.services.implement.CustomerImpl.getCustomerList;
import static de_kin.utils.ReadAndWrite.CUSTOMER_PATH;
import static de_kin.utils.ReadAndWrite.FACILITY_PATH;
import static exam_module2.controllers.DisplayMainMenu.scanner;

public class RegexInput {

    public static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    public static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    public static final String REGEX_ID_CUSTOMER = "^CUS-[0-9]{4}$";

    public static int returnOnlyNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format number, please re-enter");
            }
        }
    }
    public static String returnIdFacility(String nameService) {
        String id;
        while (true){
            id = scanner.nextLine();
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
    public static String returnIdCustomer(){
        String id;
        while (true){
            id = scanner.nextLine();
            if (Pattern.matches(REGEX_ID_CUSTOMER,id)) {
                return id;
            }else {
                System.err.println("Wrong format id customer");
            }
        }
    }

    public static String checkBirthDayCustomer(){
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

    public static String checkIdCustomerForBooking(){
        List<Customer> customerList = getCustomerList();
        String idCustomerSearch;
        while (true){
            idCustomerSearch = returnIdCustomer();
            for (Customer customers: customerList){
                if (customers.getId().equals(idCustomerSearch)){
                    return idCustomerSearch;
                }
            }
            System.err.println("Id customer not on the data");
        }
    }

    public static String checkIdFacilityForBooking(){
        List<String[]> list = ReadAndWrite.read(FACILITY_PATH);
        String idFacilitySearch;
        while (true){
            idFacilitySearch = scanner.nextLine();
            for (String[] lists : list){
                if (lists.equals(idFacilitySearch)){
                    return idFacilitySearch;
                }
            }
            System.err.println("Id facility not on the data");
        }
    }

    public static String returnDate(){
        String date;
        while (true){
            try {
                date = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
                LocalDate testDay = LocalDate.parse(date, formatter);
                return date;
            }catch (DateTimeParseException e){
                System.err.println("Wrong format date, please re-enter. example: 01/01/2000");
            }
        }

    }

}
