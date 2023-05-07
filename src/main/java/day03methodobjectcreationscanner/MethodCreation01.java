package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
      double kup =getCube(4.66);
        System.out.println("kup = " + kup);
        //
        print("Java is easy");
//method olusturmak icin 2.yol
        //OR2 2.yol ile
        String b ="techprEdu";
        //method ismi ve parametre yaz
        printConsole(b);





        //OR:bir tamsayini karesini alip konsola yazdiran bir method yaz
        int sayi=5;
        kareyaz(sayi);

        /*homework cember cevresi hesaplayan method olustur kullan
        dairenin alanini hesaplayan method olustur kullan
         */
    }

    public static void kareyaz(int sayi) {
        System.out.println(sayi*sayi);
    }

    public static void printConsole(String b) {
        System.out.println(b);
    }


    //OR:verilen bir ondalik sayinin kupunu hesaplayan bir method olustur kullan
      static double getCube(double a){
       return a*a*a;

     };
    //access mod def olacak ise access mod yazma.
//OR: Girilen bir kelimeyi ekrana yazdiran bir meth olustur kullan

    public static void print(String a){
        //eger method yeni bir data uretmiyor ise return type void
        //methodun return type i void ise body icinde return yazilmaz
        System.out.println(a);


    }



}
