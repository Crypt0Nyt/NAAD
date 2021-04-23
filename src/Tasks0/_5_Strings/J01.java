package Tasks0._5_Strings;

//Program to Convert String to Date

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class J01 {
    public static void main(String[] args) {

        String str = "2020-02-19";
        LocalDate date = LocalDate.parse(str,DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
