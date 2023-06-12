package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {


        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dateTime);//2023-06-10T22:21:30.739379200

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("MM/dd/yyyy    HH:mm");
        String formattedLdt = dtf.format(dateTime);
        System.out.println(formattedLdt);









    }
}
