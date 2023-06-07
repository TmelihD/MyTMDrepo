package day000000000;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Examples2 {
    public static void main(String[] args) {
       /*
           kullanicidan alinan string in son iki harfini 3defa yazdiran kod...

 Sample:

INPUT       : Mustafa
OUTPUT      : fafafa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yaz iste bisiyler");
        String kelime = input.nextLine();

String sonhece ="";
        for (int i = kelime.length()-2 ; i< kelime.length()  ; i++){
            sonhece = sonhece+kelime.charAt(i);
        }
        System.out.println(sonhece+sonhece+sonhece);







        /*
Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:


   Verilen tamsayının rakamları toplamı 10'dur.

 */


        Scanner input2 = new Scanner(System.in) ;
        System.out.println("3 basamakli bir tam Sayi gir");

        int number =input2.nextInt();


        if (number>99 && number<1000){

          int a = number%10;
          number=number/10;

          int b = number%10;
          number=number/10;

          int c = number%10;


          System.out.println(a+b+c);
       }













/*
kullanicidan alinan sayidan buyuk ilk 10 asal sayiyi bulan kod yaziniz.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */



        Scanner input3 = new Scanner(System.in) ;
        System.out.println("bir sayi gir.");
        int asal = input3.nextInt();
        Math.abs(asal);

        int counter = 0;

        for (int i = asal ; i < 999999999; i++) {

            if (i%2==0 || i%3==0 || i%5==0){
                continue;
            }else {
                System.out.print(i+" ");
                counter++;
            }
            if (counter==10){
                break;
            }

        } System.out.println();


             /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

        int a= 3;

        int b= 5;

       Ornek Cikti:

      a=5

       b=3
         */


        int a = 1;
        int b = 2;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a "+a);
        System.out.println("b "+b);


    /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :Java is also easy

String str=“Javaisalsoeasy”

Output: a s
         */
String s = "Java is also easy";
        for (int i = 0; i > s.length()-1 ; i++) {

            if (s.indexOf(i)==s.lastIndexOf(i)) {

               continue;
            }else {
                System.out.println(i);
            }
        }





    }
}
