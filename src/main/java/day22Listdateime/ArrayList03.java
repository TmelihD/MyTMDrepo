package day22Listdateime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {

        //OR: Kullaniciini girdigi harf listede ise listede eger harf listede degil ise listeye ekleyen kod.

        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input = new Scanner(System.in);


     int counter = 0;
     int can = 3;

        do {
            System.out.println("Harf Gir");
            String letter = input.next().substring(0,1).toUpperCase();

            if (myList.contains(letter)){
                myList.set(myList.indexOf(letter) , "Found it!");
            }else {
                myList.add(letter);
            }
            System.out.println(myList);

            counter++;
            if (counter==can){
                System.out.println("Game over");
                break;
            }
        }while (true);









    }
}
