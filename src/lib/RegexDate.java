package lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import static case_study_module2.controllers.FuramaController.scanner;

public class RegexDate {
    public static String returnDate() {
        while (true){
            try {
                String birthDay = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(birthDay, formatter);
                return birthDay;
            }catch (DateTimeParseException e){
                System.err.println("Wrong formar date, please re-enter");
            }
        }
    }
}
