package day03methodobjectcreationscanner;

import java.util.Scanner;//import ettik from java util library

public class Scanner01 {
    public static void main(String[] args) {
        //1.adim Scanner classdan object olustur

        Scanner input = new Scanner(System.in);

        //2.adim Kullaniciya ne istediginize dair mesaj verin.
        System.out.println("Lutfen yasinizi giriniz");
        //3.adim Uygun methodu kullanarak kullanicinin verdigi datayi memorye al

       byte age= input.nextByte();
        System.out.println(age);
        System.out.println("age = " + age);


    }
}
