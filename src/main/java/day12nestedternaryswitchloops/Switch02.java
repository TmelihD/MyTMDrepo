package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //OR:Ay numarasi girilince numarasi verilen aydan baslayip son aya kadar yazdiran kod.

        Scanner input= new Scanner(System.in);
        System.out.println("Bir ay belirtiniz");

        int numOfMonths = input.nextInt();


        switch (numOfMonths){
            case 1 :
                System.out.println("january");
            case 2 :
                System.out.println("february");
            case 3 :
                System.out.println("march");
            case 4 :
                System.out.println("april");
            case 5 :
                System.out.println("may");
            case 6 :
                System.out.println("june");
            case 7 :
                System.out.println("july");

            case 8 :
                System.out.println("august");
            case 9 :
                System.out.println("september");
            case 10 :
                System.out.println("october");

            case 11:
                System.out.println("november");
            case 12 :
                System.out.println("december");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi gir...");

        }
/*
NOT:Switch condition paramatreleri icinde ;String , int , byte , short ,char kullanilabilir.
NOT:Long,boolean,float,double kullanilamaz.
 */

    }
}
