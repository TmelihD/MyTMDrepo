package day10ifstatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {

        //OR:Alinan sayinin + - yada notr mu yazdir.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi  gir");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Pozitif");

        }else if (num<0){
            System.out.println("Negatif");

        }else{
            System.out.println("Notr");

        }


    }
}
