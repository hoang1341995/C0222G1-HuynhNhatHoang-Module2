package case_study_module2.utils;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;


public class test {
    public static void main(String[] args) {
        String birthDay = "11/02/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate = LocalDate.parse(birthDay, formatter);
        System.out.println(birthDay);
    }


}
