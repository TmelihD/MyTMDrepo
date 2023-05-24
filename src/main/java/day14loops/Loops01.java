package day14loops;

import javax.swing.*;

public class Loops01 {
    //interview sorusu *************************************************************************************************

    //Bir stringi ters ceviren kodu yaz
    public static void main(String[] args) {

        //1.Yol

        String t = "Java";
        String ters ="";
        for (int i  = t.length()-1 ; i>=0 ; i--){
           ters = ters + t.substring(i,i+1);

        }
        System.out.println(ters);

        //2.YOL

        String s = "Java";
        String ters2 = "";

        for (int i = s.length()-1 ; i>=0  ; i--){
            ters2 = ters2+s.charAt(i);
        }
        System.out.println(ters2);



        //OR:Verilen Stringin palindrome olup olmadigini ctrl eden kodu yazin
        //  ey edip adanada pide ye , nalan , ada , kucuk
        //okunusu tersten ve duzden ayni olan demek.

        //MAntik: Stringi ters cevir ,duz hali ile karsilastir esit ise palindrome dur.

        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i = duz.length()-1 ; i>=0  ; i--){
            ters3 = ters3+duz.charAt(i);
        }
        System.out.println(ters3);
if (duz.equalsIgnoreCase(ters3)){
    System.out.println("Palindrome");
}else {
    System.out.println("Palindrome degildir");
}



































    }
}
