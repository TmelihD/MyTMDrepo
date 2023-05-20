package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ulke ismi al alinan isme gore kisatlamalari yazdir.
         Ask user to enter country name among "America,
          England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of
            the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir ulke adi giriniz; " +
                "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, France");

        String ulke = input.nextLine();

        switch (ulke.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "engalnd":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Lutfen gecerli bir ulke adi giriniz");

        }



    }
}
