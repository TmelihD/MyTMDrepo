package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {


        //OR:Kullanicidan baslangic ve bitis degerlerini al ve alinan sayilarin arasindaki cift sayilari yazdir.

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int start = input.nextInt();

        System.out.println("Bitis deegerini giriniz");
        int end = input.nextInt();


       if (end>start) {
           for (int i = start; i <= end; i++) {

               if (i % 2 == 0) {
                   System.out.println(i + " ");
               }
           }
       }else if (start>end){
           for (int i = end; i <= start; i++) {

               if (i % 2 == 0) {
                   System.out.println(i + " ");
               }
           }
       }


       //OR:hic sayi kullanmadan 1 den 100 e kadar olan sayilari consola yazdir

        //int d = 'd'
        //sout d = 100























    }
}
