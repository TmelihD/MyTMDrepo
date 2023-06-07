package day000000000;

import java.util.Scanner;

public class Examples3 {
    public static void main(String[] args) {
  /*
           kullanicidan alinan string in son iki harfini 3defa yazdiran kod...

 Sample:

INPUT       : Mustafa
OUTPUT      : fafafa
         */


        Scanner input= new Scanner(System.in);
        System.out.println("Bir kelime yazin");
String kelime =input.nextLine();


String sonIki = "";

        for (int i = kelime.length()-2 ; i < kelime.length() ; i++) {

          sonIki =  sonIki+kelime.charAt(i);

        }
        System.out.println(sonIki+sonIki+sonIki);

//2;


        for (int i = 0 ; i < 3 ; i++) {

            System.out.print(kelime.substring(kelime.length() - 2));

        }



    }
}
