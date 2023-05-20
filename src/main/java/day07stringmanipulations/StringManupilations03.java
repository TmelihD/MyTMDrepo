package day07stringmanipulations;

public class StringManupilations03 {
    public static void main(String[] args) {

        //OR: bir String in bas ve sonunda space karakteri var ise siliniz.

        String y = " Ali Can    ";

        String kirp = y.trim();
        //trim methodu yanlizca bastaki ve sondaki space karakterlerini siler
        System.out.println(kirp);

        //OR:Fiyatlari verilen urunlerin toplam fiyatini bulunuz.

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$","");
        String laptop2 = laptop.replace("$","");

       double toplamfiyat =  Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("Total = "+ toplamfiyat);


        //OR: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdirniz.

        String name = "  ali cAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);
        System.out.println(""+first+" "+last);



    }
}
