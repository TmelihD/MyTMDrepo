package day09Ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //OR:Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdir


        Scanner input = new Scanner(System.in);
        System.out.println("Ltfn Bir Sayi Giriniz");
        int num = input.nextInt();

        //1.yol

       if(num%2==0) {
           System.out.println("Cift sayi");
       }
        if(num%2 != 0) {
            System.out.println("Tek sayi");}

        //2.yol

        if (num%2 == 0){
            System.out.println("Cift sayi");
        }else{
            System.out.println("Tek sayi");
        }

    }
}
