package JavaConcepts.Date;

import java.time.LocalDate;

public class example {


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(15);
        LocalDate tomorrow = date.plusDays(13);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tommorow date: "+tomorrow);
    }
}
