package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //OR:Kullanicidan iki sayi alan ve yapilacak islem alan ve 4 islem yapan kod

        Scanner input=new Scanner(System.in);
        System.out.println("Iki tane sayi gir");
       double a = input.nextDouble();
       double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,% ");
        char opr =input.next().charAt(0);

        switch (opr){
            case '+' :
                System.out.println(a+b);
                break;
            case '-'  :
                if (a>b){
                    System.out.println(a-b);
                }else {
                    System.out.println(b-a);
                }
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (a>b){
                    System.out.println(a/b);
                }else {
                    System.out.println(b/a);
                }
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            default:
                System.out.println("Lutfen Istenilen degerler disinda bir deger girme");
                //v






        }

    }
}
