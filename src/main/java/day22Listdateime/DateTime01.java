package day22Listdateime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {

       //Icinde bulundugumuz zaman dilimini nasil aliriz?
       LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-06-07


        //Tarihten istedigimiz bileseni nasil aliriz?

        int montValue = myCurrentDate.getMonthValue();
        System.out.println(montValue);

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek day = myCurrentDate.getDayOfWeek();
        System.out.println(day);


//Ileriki tarihe gitmek.

        System.out.println(myCurrentDate.plusDays(6).plusMonths(4));


   //gecmis icin...
        System.out.println(myCurrentDate.minusDays(5).minusMonths(9));


        //Specific tarih olusturmak...

        LocalDate date1 = LocalDate.of(2001,9,3);
        LocalDate date2 = LocalDate.of(2001,9,4);



        boolean isafter = date1.isAfter(date2);
        System.out.println(isafter);


    }
}
