package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //OR:Ay isimleri girilince kacinci ay oldugunu yazan kod.

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Ay Oldugunu Yaziniz");
        String ay = input.next();

        if (ay.equalsIgnoreCase("January")){
            System.out.println("1");
        }else if (ay.equalsIgnoreCase("Fabruary")){
            System.out.println("2");
        }else if (ay.equalsIgnoreCase("March")) {
            System.out.println("3");
        }else if (ay.equalsIgnoreCase("April")) {
            System.out.println("4");
        }else if (ay.equalsIgnoreCase("May")) {
            System.out.println("5");
        }else if (ay.equalsIgnoreCase("June")) {
            System.out.println("6");
        }else if (ay.equalsIgnoreCase("July")) {
            System.out.println("7");
        }else if (ay.equalsIgnoreCase("August")) {
            System.out.println("8");
        }else if (ay.equalsIgnoreCase("September")) {
            System.out.println("9");
        }else if (ay.equalsIgnoreCase("October")) {
            System.out.println("10");
        }else if (ay.equalsIgnoreCase("November")) {
            System.out.println("11");
        }else if (ay.equalsIgnoreCase("December")) {
            System.out.println("12");
        }else {
            System.out.println("Invalid month name...");
        }

    }
}
