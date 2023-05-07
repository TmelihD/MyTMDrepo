package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {
        /*
        OR:Sehir ismi icin bir variable olustur ve once"Ankara sonra "Izmir
        degerlerini ata ve yazdir
         */

        String cityName = "Ankara";

        cityName ="Izmir";
        System.out.println(cityName);

        cityName ="Istanbul";
        System.out.println(cityName);

        //OR: Sehir plaka kod icin var olustur once 34 sonra 35 ata ve yazdir

        byte sehirPlaka = 34;
        System.out.println(sehirPlaka);
        sehirPlaka=35;
        System.out.println(sehirPlaka);
//OR:Basarili mi sorus icin bir var olustur ve Falsa sonra true ata ve yazdir
        boolean isBasarili= false ;
        System.out.println(isBasarili);
        isBasarili= true;
        System.out.println(isBasarili);


    }
}
