package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        /* Stringdeki belli bir noktadan belli bir noktaya kadar al dynamic
         */


        String a = "abc@gmail.com";

        int startingIndex = a.indexOf('@')  +1   ;
       int endingIndex= a.indexOf('.');

       String companyName =a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);

        // equals() Iki string in ayni olup olmadigini kontrol eder.
        String h ="fdsz";
        String g ="fdsz";
        h.equals(g);

        //

        //Stack memory kucuk olan ve primitive leri ve np lerin referance larini barindirir
        //Heap memory buyuk olan ve n Primitive leri barindiran.
        //Stringlerin esitligi == yerine equals metodu dur.
        //


        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s==t);//False
        System.out.println(s.equals(t));//False
        System.out.println(s==r);//False
        System.out.println(s.equals(r));//true


        //OR:Stringleri buyuk kucuk harf dikkate almadan ayni mi die ctrl et

        String j = "ali Can";
        String k = "Ali Can";
        j.equalsIgnoreCase(k);

        //


    }
}
