package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {



        //Ex:
        //Kullanicidan alinan tarih gectiyse gecersiz, gelecek ise zamani girin diyen kod.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year ,month and day numbers in the given order...");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

       LocalDate givenDate = LocalDate.of(year,month,day);

       if (givenDate.isBefore(LocalDate.now())){
           System.out.println(givenDate + " invalid date");
       }else {
           System.out.println("Enter time for ticket");
       }

       //EX: Girilen tarihin hangi gun oldugunu soyleyen kod.

        System.out.println("Please enter a date in the given order. Year , month and day");


        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();


        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());


    }
}
