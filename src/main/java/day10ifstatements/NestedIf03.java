package day10ifstatements;

import java.util.Scanner;
import java.util.SortedMap;

public class NestedIf03 {
    public static void main(String[] args) {


        /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse
                    "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password"
                    yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sifreni Gir...");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);


        /*if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){//Ilk harfi buyuk ise

            if (pwd.charAt(0)=='A'){
                System.out.println("Gecerli pass");
            }else{
                System.out.println("Gecersiz pass,buyuk harf ama A degil.");
            }

        }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
            if (pwd.charAt(0)=='z'){
                System.out.println("Gecerli pass");
            }else{
                System.out.println("Gecersiz pass,ilk harf z degil");
            }
        }else {
            System.out.println("Ilk karakter harf olmalidir");
        }*/



        if (firstChar>='A' && firstChar<='Z'){//Ilk harfi buyuk ise

            if (firstChar=='A'){
                System.out.println("Gecerli pass");
            }else{
                System.out.println("Gecersiz pass,buyuk harf ama A degil.");
            }

        }else if (firstChar>='a' && firstChar<='z'){
            if (firstChar=='z'){
                System.out.println("Gecerli pass");
            }else{
                System.out.println("Gecersiz pass,ilk harf z degil");
            }
        }else {
            System.out.println("Ilk karakter harf olmalidir");
        }





    }


}
