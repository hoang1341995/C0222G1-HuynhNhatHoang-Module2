package case_study_module2.utils;



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import static case_study_module2.controllers.FuramaController.scanner;


public class test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate today = LocalDate.now();
        String todayFormat = today.format(formatter);
        System.out.println(today);
        System.out.println(todayFormat);
//
//        System.out.println(todayFormat);
        //System.out.println(checkAgeCustomer());

//        String year = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
//        LocalDate testDay = LocalDate.parse("01/01/"+year, formatter);
//        System.out.println(testDay.format(formatter));
//        String str = "01/02/2022";
//        String a = str.substring(0,2);
//        System.out.println(a);

    }

    public static int checkAgeCustomer(){
        while (true){
            try {
                String birthDay = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(birthDay, formatter);
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(testDay.getYear(), testDay.getMonth(), testDay.getDayOfMonth());
                Period period = Period.between(birthday, today);

                return period.getYears();
            }catch (DateTimeParseException e){
                System.err.println("Wrong format date, please re-enter");
            }

        }
    }


}
