package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary statment
        //OR: Sayi 10dan kucuk ise kucuk yazdir degilse kucuk d yazdir.

        // ternary coumu
        // condition  ? cond true is calisir:false ise calisir.


        int num = 65;

       String sonuc = num < 10   ?   "Kucuk"   :   "Kucuk Degil"  ;

        System.out.println(sonuc);


        //OR:Sayi cift ise console a cift yazdir yoksa tek yazdir.



        if (num%2>0){
            System.out.println("Tek Sayi");
        }else if (num%2==0){
            System.out.println("Cift Sayi");
        }else {
            System.out.println("Tanimsiz");
        }
        //////////////////////////////////////

        String tekcift = num%2>0 ?  "Tek Sayi" : "Cift Sayi" ;
        System.out.println(tekcift);

        //OR:Sayi 0dan buyuk ise pazitif degilse negatif yazdir

        String pozneg = num>0? "Pozitif" : "Pozitif Degil" ;
        System.out.println(pozneg);

        //ALT
        System.out.println(num>0? "Pozitif" : "Pozitif Degil");





        //OR:Kullanicidan iki sayi al ve buyuk olmayan sayiyi yazdir.

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi yaz");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1.yol

        if (first<second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

        //2.yol

        double result2 = first<second   ? first : second ;









    }
}
