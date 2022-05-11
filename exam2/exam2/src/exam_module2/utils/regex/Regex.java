package exam_module2.utils.regex;

import exam_module2.models.Bank;
import exam_module2.utils.exception.BankException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.regex.Pattern;

import static exam_module2.controllers.DisplayMainMenu.scanner;

public class Regex {

    public static final String REGEX_STR = "^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";

    public static int regexNumber() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.err.println("Phải là số dương, vui lòng nhập lại");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng số, vui lòng nhập lại");
            }
        }
    }

    public static String regexDate() {
        String date;
        while (true) {
            try {
                date = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").
                        withResolverStyle(ResolverStyle.STRICT);
                LocalDate testDay = LocalDate.parse(date, formatter);
                return date;
            } catch (DateTimeParseException e) {
                System.err.println("Sai định dạng ngày tháng, vui lòng thử lại. ví dụ: 01/01/2000");
            }
        }

    }

    public static String regexName() {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (Pattern.matches(REGEX_STR, name)) {
                return name;
            } else {
                System.err.println("Sai định dạng tên, vui lòng thử lại. ví dụ: Nguyen Van A");
            }
        }
    }

    public static int autoIncrementId(List<Bank> bankList) {
        if (bankList.size() == 0) {
            return 1;
        } else {
            return bankList.get(bankList.size() - 1).getIdAccount() + 1;
        }
    }


}
