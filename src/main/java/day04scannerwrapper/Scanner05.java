package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayini ilk iki ve son iki basamagindaki rakamlarin
        //toplamini yazdiran bir code yaz.

        Scanner input= new Scanner(System.in);
        System.out.println("5 basamakli bir sayi gir sikerim");
        int number = input.nextInt();
        // % mobulus operator solundaki sayinin sagindakine bolumunden kalani verir
        //JAva sayiyi yuvarlamaz ondalik kismi siler

        /* 38671 % 10 = 1
           38671 / 10 =3 867

           3867 % 10 = 7
           3867 / 10 = 386

           386 % 10 = 6
           386 / 10 = 38

           38 % 10 = 8
           38 / 10 = 3

           3 % 10 = 3
         */
    //son rakam
        int birlerbas=number%10;
        number=number/10;
     //sondan ikinci rakalm
        int onlarbas=number%10;
                number=number/10;
      //sondan ucuncu rakam
        int yuzlerbas=number%10;
        number=number/10;
      //sondan 4

        int binlerbas=number%10;
        number=number/10;

   //sondan 5
        int onbinlerbas=number%10;

        System.out.println(onbinlerbas+binlerbas+birlerbas+onlarbas);

/* Kullanicidan adinan uc sayini ortalamasini bulan bir code
kullanicidan alinan 3 basamakli sayinin rakamlari toplami bulan code

 */


    }


}
