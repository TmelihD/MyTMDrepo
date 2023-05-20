package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s = "learn Java earn money";

        //OR: s stringini "money " ile bitip^bitmedigini ctrl ed.

        boolean ends = s.endsWith("money");
        System.out.println(ends);

        //OR: s teki money kelimesini dollar kelimesine cevir.

      String dollar = s.replace("money","dollar");
        System.out.println(dollar);

        String win = s.replace(" earn"," win");
        System.out.println(win);

        //s teki tum a harflerini * a cevir.
        String sa =s.replace("a","*");
                   s.replace('a','*');
        System.out.println(sa);

        //OR;s teki tum n harfini xxx yap.

        String xxx = s.replace("n","xxx");
        System.out.println(xxx);

        //OR: s teki e harflerini sil.

        String edelete = s.replace("e","");
        System.out.println(edelete);


       String t = "Ali 13 yasindadir!..." ;
        //OR:t deki tum rakamlari * yap.
        //Regular Expressions ; bir gurup datayi ifade etmek icin regex kullanilir.
        //tum rakamlar=[0-9]
        //tum kucuk harfler = [a-z]
        //tum b harfler = [A-Z]
        //tum harfler = [a-zA-Z]
        //tum harfler ve rakamlar [ a-ZA-z0-9]
        //tum noktalama isaretleri = \\p
        //tum sesli harfler = [aeiouAEIOU]
        //x,a,w = [xaw]
        //kucuk harflerden haric = [^a-z]
        //Not bit gurup datayi degistirmek icin replaceAll

        String yildiz = t.replaceAll("[0-9]","*");
        System.out.println(yildiz);


    }
}
