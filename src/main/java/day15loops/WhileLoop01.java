package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {


        //for Kalibi:
        /*
        for (  baslangic ;    loop calisma kurali    ;    arti eksi    ){
            calisacak kod
        }

         */

        //WhileLoop kalibi
        /*
        baslangic degeri
        while(  Loop calisma kurali        ){
         calisacak kod

         arti eksi}
         */

        //OR:3 den 6 ya kadar tam sayilari consola yazdir...

                  //1.yol
         for (int i = 3 ; i<7  ; i++){
             System.out.print(i+" ");
         }
        System.out.println();

                  //2.Yol
            int i = 3;

         while (i<7){
             System.out.print(i+" ");
             i++;
         }
        System.out.println();



         //OR: 23 den 12 ye kadar cift tam sayilari console a yazdir...

        int k = 23 ;
        while (k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;

        }
        System.out.println();


        //OR:6 dan 19 a kadar tek tam sayilari yazdir.

        int j = 6 ;
        while (j<20){
            if (j%2!=0){
                System.out.print(j+" ");
            }
            j++;

        }
        System.out.println();
















    }
}
