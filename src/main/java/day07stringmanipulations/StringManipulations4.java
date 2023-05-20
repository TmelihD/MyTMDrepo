package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations4 {
    public static void main(String[] args) {

        String t = "Ali 12 yasindadir...";

        //t deki tum harfleri * yap

        String yildiz = t.replaceAll("[a-zA-Z]", "*");
        System.out.println(yildiz);

        String tvoyel = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(tvoyel);

        String harfharic = t.replaceAll("[^a-zA-Z]", "<>");
        System.out.println(harfharic);

       /* OR:
        Asagidaki kurallara gore kullanicini girdigi password u ctrl et.

        1: en az 8 karakter icersin
        2: space characteri passwordde olmasin
        3: en az bir buyuk harf olsun
        4: en az bir kucuk harf olsun
        5: en az bir rakam icermelidir */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
        String pass = input.nextLine();

        boolean is1 = pass.length() > 7;
        System.out.println("En az 8 karakter."+ is1);

        boolean is2 = !pass.contains(" ");
        System.out.println("Space karakteri olamaz"+is2);

        boolean is3 = pass.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("En az bir buyuk harf"+is3);

        boolean is4 = pass.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("En az bir kucuk harf"+is4);

        boolean is5 = pass.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("En az bir sayi icermeli"+ is5);
        System.out.println(is1&&is2&&is3&&is4&&is5 );
        System.out.println("Sifreniz Kaydedildi");



    }
}
