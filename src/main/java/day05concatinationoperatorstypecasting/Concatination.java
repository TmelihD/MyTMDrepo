package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {

      //OR:Bir string ve iki int var olustur.String ile intlerin toplamini
      //yazdir

        String s ="elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b); //elma1011 ,Concatination budur.

       System.out.println(s+(a+b));//elma21 ,
        System.out.println(s+a*b); //elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //OR:Size String olarak verilen iki fiyatin toplamini yazdir

        String shirt = "2300";
        String shoes = "5200";

        Integer.valueOf(shirt);
        Integer.valueOf(shoes);

        int toplamfiyat=Integer.valueOf(shirt)+ Integer.valueOf(shoes);
        System.out.println(toplamfiyat);

        //OR:String lrak verilen iki fiyatin toplamini yazdir.
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

        int toplam = Integer.valueOf(tv)+ Integer.valueOf(radio);
        /*Value of metodu tum karakterleri rakam olan stringleri cevirir
        eger string icinde rakam olùmayan bir karakter var ise hata
         */









    }
}
