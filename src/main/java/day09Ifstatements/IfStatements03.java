package day09Ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //OR: Verilen karakter e gore buyuk ve ya kucuk harf yazdiran bir kod yaz.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char ch = input.next().charAt(0);


        //1.yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");
        }
        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harf");}

        //2.yol

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");
        }else if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harf");
        }else{
            System.out.println("Bu bir harf diyil");
        }




    }
}
