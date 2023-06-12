package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        // Anlik Zamani nasil aliriz?

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // Anlik zamanda bilesenler nasil alinir.

        int hour = currentTime.getHour();
        int nanoSaniyeXD = currentTime.getNano();
        System.out.println(hour+" "+nanoSaniyeXD);

        int minute = currentTime.getMinute();
        System.out.println(minute);

        // Gelecek ve ya gecmise gitmek.

        currentTime.plusMinutes(13).plusHours(90).minusHours(4); // bunu sout yapanilirsin ve ya bunu local time object yapabilirsin.


       // LocalTime addTime = currentTime.plusMinutes(13).plusHours(90).minusHours(4);



        // Zaman formati nasil degistirilir?

        /*
        DateTime class ra kullanilan tarih saat formatlari

       HH : mm == 24 lu saat sistemi

       hh : mm == 12 li saat sistemi.

       hh : mm a == 12 li saat sistemi. AM ve PM de gosterilir.

       HH : mm : ss == 24 lu saat sistemi

      HH : MM  == Yanlis format.

      dd-MM-yyyy == gun ay yil

      MMM == Aug
      MMMM == August
         */

        DateTimeFormatter dtf1 =DateTimeFormatter .ofPattern("HH : mm");
        String formattedCurrentTime = dtf1.format(currentTime);
        System.out.println(formattedCurrentTime);


        //Date formati nasil degistirilir.

        LocalDate myDate = LocalDate.of(2023,8,13);
        System.out.println(myDate);// 2023-8-13

        //Tarihi ay gun yil sekline ceviriniz.

        DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);
        System.out.println(formattedMyDate);

        // Baska bir konuma gore tarih ve zaman almak.

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

       LocalTime inBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(inBerlin);















    }



}
