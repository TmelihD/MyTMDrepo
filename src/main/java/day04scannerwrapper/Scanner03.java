package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonuclarini yazdiran


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayiIki = input.nextDouble();
        System.out.println("toplamlari:"+sayi1 + sayiIki);
        System.out.println(sayi1 - sayiIki); //Yazdirtmiyor :/
        System.out.println("carpim:"+sayi1 * sayiIki);
        System.out.println("bolum"+sayi1 / sayiIki);
    }
}
