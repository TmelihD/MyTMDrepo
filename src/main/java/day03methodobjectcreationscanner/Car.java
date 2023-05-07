package day03methodobjectcreationscanner;

public class Car {

   public String model="Tesla" ;
   public int fiyat=20000;

   public void hareket(){ //not:return type void olunca methode icine return yazilmaz
       System.out.println("Tesla cok hizli hareket eder");

   }
   public void dur(){
       System.out.println("Cok guvenli bir sekilde durur");
   }


}
