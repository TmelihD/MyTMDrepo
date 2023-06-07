package day000000000;

import java.util.Scanner;

public class Examples4 {
    public static void main(String[] args) {

/*
kullanicidan alinan sayidan buyuk ilk 10 asal sayiyi bulan kod yaziniz.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */


        Scanner input2 = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi2 = input2.nextInt();


        int counter2 = 0;

        for (int i = sayi2; i < 999999999; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i / sayi2 * sayi2 == 0) {

                continue;
            } else {
                System.out.print(i + " ");
                counter2++;
            }
            if (counter2 == 10) {
                break;
            }

        }
        System.out.println();
        ;





            }


        }















