package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

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



        //t deki tum rakamlari ! yap
        String unlem = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(unlem);
//OR:t deki tum sesli harfleri ? yap

        String tvoyel = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println("tvoyel = " + tvoyel);

        //OR:t deki kucuk harfler haric tum karakterleri <> yap

        String bk = t.replaceAll("[^a-z]","<>");
        System.out.println(bk);

        //OR: t deki tum harfler haricindekileri + yap

        String harfharic = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(harfharic);

        //OR: t deki space haric herseyi ? yap
        String spacet = t.replaceAll("[^ ]","?");
        System.out.println(spacet);

        //t deki voyel ler ve space haric tum karakterleri & yap.

        String and = t.replaceAll("[^aeiouAEIOU ]","&");
        System.out.println(and);




    }
}
