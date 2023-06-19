package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        ArrayList<String> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();



       //Linked list
        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        System.out.println(s);

        s.add(2,"Omer");
        System.out.println(s);




    }
}
