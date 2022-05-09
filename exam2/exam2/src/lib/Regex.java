package lib;

import exam_module2.utils.exception.CustomException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.regex.Pattern;

import static exam_module2.controllers.DisplayMainMenu.scanner;

public class Regex {

    public static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String REGEX_STR = "^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";


    public static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    public static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    // "5\d-[A-Z]\d-((\d{4})|(\d{3}\.\d{2}))" "51-X2-123.04"

    public static int regexNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng số, vui lòng nhập lại");
            }
        }
    }

    public static String regexBirthDay(){
        String birthDay;
        DateTimeFormatter formatter;
        LocalDate testDay;
        LocalDate today;
        LocalDate birthday;
        Period period;
        while (true){
            try {
                birthDay = scanner.nextLine();
                formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").
                        withResolverStyle(ResolverStyle.STRICT);
                testDay = LocalDate.parse(birthDay, formatter);
                today = LocalDate.now();
                birthday = LocalDate.of(testDay.getYear(), testDay.getMonth(), testDay.getDayOfMonth());
                period = Period.between(birthday, today);
                if (period.getYears() < 18 || period.getYears() > 100){
                    throw new CustomException("Tuổi phải lớn hơn 18 và nhỏ hơn 100");
                }else {
                    return birthDay;
                }
            }catch (DateTimeParseException e){
                System.err.println("Sai định dạng ngày tháng, vui lòng thử lại");
            }catch (CustomException e){
                System.err.println(e.getMessage());
            }

        }
    }

    public static String regexDate(){
        String date;
        while (true){
            try {
                date = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").
                                               withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(date, formatter);
                return date;
            }catch (DateTimeParseException e){
                System.err.println("Sai định dạng ngày tháng, vui lòng thử lại. ví dụ: 01/01/2000");
            }
        }

    }

    public static String regexName(){
        String name;
        while (true){
            name = scanner.nextLine();
            if (Pattern.matches(REGEX_STR,name)){
                return name;
            }else{
                System.err.println("Sai định dạng tên, vui lòng thử lại. ví dụ: Nguyen Van A");
            }
        }
    }

    public static String regexPhoneNumber(){
        String phone;
        while (true){
            phone = scanner.nextLine();
            if (Pattern.matches(REGEX_PHONE_NUMBER,phone)){
                return phone;
            }else{
                System.err.println("Sai định dạng số điện thoại, vui lòng thử lại.");
            }
        }
    }

    public static String regexEmail(){
        String email;
        while (true){
            email = scanner.nextLine();
            if (Pattern.matches(REGEX_EMAIL,email)){
                return email;
            }else{
                System.err.println("Sai định dạng Email, vui lòng thử lại.");
            }
        }
    }

    public static String checkStartDay(){
        String startDay;
        DateTimeFormatter formatter;
        LocalDate testDay;
        LocalDate today;
        LocalDate dateTime;
        Period period;
        while (true){
            try {
                startDay = scanner.nextLine();
                formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                testDay = LocalDate.parse(startDay, formatter);
                today = LocalDate.now();
                dateTime = LocalDate.of(testDay.getYear(), testDay.getMonth(), testDay.getDayOfMonth());
                period = Period.between(dateTime, today);
                if (period.getYears() < 0 || period.getDays() < 0 || period.getMonths() < 0){
                    throw new CustomException("Ngày bắt đầu không hợp lệ, vui lòng thử lại");
                }else {
                    return startDay;
                }
            }catch (DateTimeParseException e){
                System.err.println("Sai định dạng ngày tháng, vui lòng thử lại");
            }catch (CustomException e){
                System.err.println(e.getMessage());
            }

        }
    }

    public static String checkEndDay(String startDay){
        String endDay;
        LocalDate startDays;
        DateTimeFormatter formatter;
        LocalDate testDay;
        LocalDate dateTime;
        Period period;
        while (true){
            try {
                endDay = scanner.nextLine();
                formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").
                            withResolverStyle(ResolverStyle.STRICT);
                testDay = LocalDate.parse(endDay, formatter);
                startDays = LocalDate.parse(startDay, formatter);
                dateTime = LocalDate.of(testDay.getYear(), testDay.getMonth(), testDay.getDayOfMonth());
                period = Period.between(dateTime, startDays);
                if (period.getYears() < 0 || period.getDays() < 0 || period.getMonths() < 0){
                    throw new CustomException("Ngày kết thúc được trước ngày bắt đầu, vui lòng thử lại");
                }else {
                    return endDay;
                }
            }catch (DateTimeParseException e){
                System.err.println("Sai định dạng ngày tháng, vui lòng thử lại");
            }catch (CustomException e){
                System.err.println(e.getMessage());
            }

        }
    }




}
