package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        //1) String builder classi da string ureten bir classtir.
        //2) String Class "immutable"  yani degistirelemez string uretir ,String builder ise "mutable" string uretir.
        //3) Immutable olmak demek orjinal degerin korunmasi , degistirilemez olmasi demektir.Mutable olmasi ise degistirilebilir olmasi demektir.

        //Immutable;

        String s = "java ";

        String t = s+"!";

        String w = t+"?";

        String a = "Money";
        a=a+"More";
        //String degistirdikten sonra ayni Stringe assign edersek, Java yeni bir container olsuturur. Degisen degeri buray akoyar ve eski conteiner adressiz kalir. Garbage collecter adressiz yapilari
        //otomatik olarak siler.

        //Mutable
//1st way;
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);

        sb1.append("!");

        System.out.println(sb1);

        //2nd way;

        StringBuilder sb2 =new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity()); //16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); //19
        System.out.println(sb2.capacity()); //34



        //Capacity() ve length() arasindaki fark...
/*
Capacity javanin verdigi data depolama sayisidir.
length ise verilen deponun kullanilan kismidir.

Java capacity baslangic olarak 16 verir.Eger verilen capacisty asilirsa , var olan capasitenin 2 fazlasi seklinde degsitirir.

 */


        //Default capacity nasil deegistirilir.

        StringBuilder sb3 = new StringBuilder(3);

        sb3.append("Aly");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());





    }
}
