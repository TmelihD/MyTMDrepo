package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan bir diktorgenin iki kenar uzunlugunu al
        //alanini hesapla
        //cevresini hesapla

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Kenari Gir");
        double kenar1= input.nextDouble();
        System.out.println("ikinci kenari giriniz lan");
        double kenar2= input.nextDouble();

        System.out.println("Alan:"+ kenar1*kenar2);
        System.out.println("Cevre:"+ (2*kenar1+2*kenar2));
    }
}
