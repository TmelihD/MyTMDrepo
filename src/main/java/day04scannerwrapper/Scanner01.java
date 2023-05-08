package day04scannerwrapper;
import java.util.Scanner;
public class Scanner01 {

    public static void main(String[] args) {
        //OR:Kullanicidan ilk ismini ve soyismini alip ikisini ayni
        //satirda yazdir

        //1. Scanner classtan bir object olusutur
        Scanner input = new Scanner(System.in);

        // 2.Kullaniciya mesaj yaz
        System.out.println("Ilk isminizi yaziniz");

        //3.Uygun methodu kullanarak kullanicini verdigi datayi memory e
        //yerlestiriniz.

        String firstName = input.next();

        //
        System.out.println("Soydainizi Giriniz");
        String LastName =input.next();
////
        System.out.println(firstName+" "+LastName);

    }
}
