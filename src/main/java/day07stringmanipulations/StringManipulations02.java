package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*
        OR:
        Asagidaki kurallara gore kullanicini girdigi password u ctrl et.

         1: en az 8 karakter icersin
         2: space characteri passwordde olmasin
         3: en az bir buyuk harf olsun
         4: en az bir kucuk harf olsun
         5: en az bir rakam icermelidir

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sifre Olusturunuz");
        String sifre = input.nextLine();

        boolean lengthSifre = sifre.length()>7;
        System.out.println("En az 8 karakter bulunmali = "+lengthSifre);

        boolean isSpace= !sifre.contains(" ");
        System.out.println("Sifreniz space karekteri iceremez = "+isSpace);

        boolean bharf =sifre.replaceAll("[^A-Z]","") .length()>0 ;
        System.out.println("Sifreniz en az bir buyuk harf icermeli = "+bharf);

        boolean kharf = sifre.replaceAll("[^a-z]","").length()>0 ;
        System.out.println("Sifreniz en az bir kucuk harf icermeli = "+kharf);

        boolean rakam = sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("Sifreniz en az bir rakam icermeli = "+rakam);


        System.out.println("Sifreniz Gecerli = "+(lengthSifre && isSpace && bharf && kharf && rakam));




    }
}
