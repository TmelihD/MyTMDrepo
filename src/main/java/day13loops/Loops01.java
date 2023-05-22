package day13loops;

public class Loops01 {

    public static void main(String[] args) {


        //OR:ekrana 5 defa hi yazdir.

        /*
        Code Standarts:
        1) tekra olmamalidir
        2) herzaman dynamic olmalidir
        3) Tamir,fix ve update kolay yapilabilmelidir.
         */

        ////////////////////////////////////////////////////////////////////////////////////
        //4 tane loop vardir... 1 for-loop  2 while-loop    do-while-loop    4 for-each-loop

       /*
        for (Baslangic degeri ;   calisma sarti   ;    arttirma eksiltme ){

        }
        */



        for (int i = 1  ;   i <= 5  ;    i++){
            System.out.println("Hi");
        }



        //OR:11 den 14 e kadarki tum tam sayilari yazdiran kod

        for (int i = 11;i<=14;i++){
            System.out.println(i);
            //dor loop ta genelde hep i kullanilir.
        }

        //OR:40 dan 22 e kadar tum cift sdayilari ekrana yazdir.

        for (int i = 40; i>=22 ; i--){
           if (i%2 ==0){
               System.out.println(i);
           }
        }
//OR: 18 den 56 ya kadar tum tek sayilari ekrana yazdir.

        for (int i = 18; i<=56 ; i++){
            if (i%2 !=0){
                System.out.print(i+" ");
            }
        }

    }
}
