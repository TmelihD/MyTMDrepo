package day20statickeywordconstuctors;

public class StaticBlocks01 {

    // Bir variable olusturuldugunda deger atanmazsa eger o variable i initialize etmediniz demektir.
   static double pi;
   static String shape;

   // Bazen main methoide calistirilmadan once variable larin hazir hale getirilmesi gerekir.Bu yuzden static blocklar kullanilir.
    //Static block lar initialize edilirse her seyden once hazir hale getirilmis olur

   static  {
       pi = 3.14;
       System.out.println("Static1");
   }
   static {
       shape = "Circle";
       System.out.println("Static2");
   }

    public static void main(String[] args) {
        System.out.println(pi);


    }


}
