package day20statickeywordconstuctors;

public class Students {

    /*
    1) Static variables ve ya static methodlar (class members) tum objeler icin ortak elemandir.
    2) Static class members uzerinde yapilan tum degisiklikler tum objeleri etkiler.
    3) Static class members class a , non-static class members objelere monte edilir.
    Mesela; bir class dan 100 tane object olsuturuldugunda non-static olanlar 100kere olusturulur, ama static olanlar
    obje sayisindan bagimsiz olarak bir kere olsuturulurlar.
    4) static class members a ulasmak icin obje olusturulmaya gerek duyulmaz. ama non-static memberlara
    ulasmak icin object olusturmak sarttir.
    5) Static variable larin diger adi class variable dir. Non-static variable larin diger adi Instance Variable ve ya Object Variable dir.
     */


  public static String stdName = "Tom Hanks";

  public int age = 13;

  public static void staticMethode(){
    System.out.println("statik metod");
  }
  public void nonMethode(){
    System.out.println("statik degil");
  }



}
