package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        /*:OR:Kullanicidean yas degeri alan sonrada hangi aralikta
        oldugunu bulan bir kod yaz.
        0 4 bebe
        5 12 cocuk
        13 20 genc
        21 30 yetiskin
        30 ustu tanimlanmamis.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis Yas Degeri");
        }
/*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/
    }
}
