package day24stringbuilder;

public class Student {

    //ACces mods..
   // public, protected , default , private
    //def mod icin basina acces mod yazilmaz.

    /*

   public her classtan kullanilabilir.
   protecetd olanlarbaska package lardan kullanilmaz , ancak baska package da childe class icinden kulllanilabilir.
   default olanlar baska package lardan kuullanilamazlar.
   private olanlar yanlizca kendi bulundugu classtan kullanilabilir.

   not; protected ile default arasindaki farklari inter de sorulabilir...(protected olanlar baska package lardan kullanilamazlar ancak child classtan kullanilmabiulir, default
   ta acces modifier konulmaz.
     */

    public String stdName = "Ali Can";

    protected String adresse = "Istanbul";

    String email = "ali@gmail.com";

    private String ssnId = "4325265644";



}
