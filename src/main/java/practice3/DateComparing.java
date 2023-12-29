package practice3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateComparing {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(1999,12,1);
        LocalDate date2=LocalDate.of(1996,03,18);
        System.out.println(ChronoUnit.MONTHS.between(date2,date));
        Period p=Period.between(date2,date);


        System.out.println(p.getYears());
        System.out.println(p.getMonths());

    }
}
