package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");

        sb1.reverse();
        System.out.println(sb1); //Stringin ters cevirilmesi looplar ile de yapilabilir.


        sb1.deleteCharAt(6);
        System.out.println(sb1);

        sb1.delete(4,7);
        System.out.println(sb1);

        sb1.replace(2,5,"OOO");
        System.out.println(sb1);

        sb1.insert(3,"XXX");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        // sonuc eksi kac ise okadar onde ya da +kac ise okadar ileride demektir.


        //String builder nasil string e  cevirilir?

       String str2 = sb2.toString().toUpperCase();

       //String nasil string builder a cevirliir?

       StringBuilder newsb2 = new StringBuilder(str2);







    }
}
