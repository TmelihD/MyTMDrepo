package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        /* obje olustururken;
        class ismi+Obje ismi+Assignment op+ "new"+Constructor
        constructor java da obje olusturmak icin kullanilan ozel bir methoddur
        new keyword u sifir dan yeni bir obje olusturmak icin kullanilir

         */
        Car myCar = new Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        myCar.hareket();


    }


}
//homework
//icinde isim ve yas olan ile teach metodu bulunan bir teacher object olustur
//ve O uzerinde bu ozellikleri kullanin