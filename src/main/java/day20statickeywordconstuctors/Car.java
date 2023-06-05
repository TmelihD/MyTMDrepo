package day20statickeywordconstuctors;

public class Car {
    /*
    Constructor ; Classlardan obje uretmemize yarayan code blocklardir.
    Java "default constructer"    car(){}   mesela.

    Bir classta farkli parametreleri kullanarak istedigimiz kadar constructor olusturabiliriz.
    farkli constructor lar sayesinde bir class tan farkli fdarkli objeler olusturulabilir.



    1) Cons nasil olusturulur;
    Access modifier  +  Class ismi   +   ()  +   {}    *******  interview sorusu
    2) Method ile cons arasindaki farklar nelerdir...
    - Methodlar da return type vardir , cons larda yok
    - Isimlendirme, methodlar yaptiklari ise gore isimlendirilirler. Cons lar herzaman class ismi olur.
    - Methodlar bir action icin olusturulurlar , Cons lar ise bir Obje olusturmak icindir.
    - Method isimleri kucuk harfle baslar. Constructor isimleri Class ismi oldugu icin Buyuk harf ile baslar.

    3) Parametreli constructor lar olusturarak ayni class tan farkli ozelliklere sahip farkli objeler olusturulabilir.
     */

    String make  = "Honda";

    String model = "Accord";

    int year = 2023;

    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make = make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }




    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}
