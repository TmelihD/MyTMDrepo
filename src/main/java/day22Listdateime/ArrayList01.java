package day22Listdateime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


        //Listteki tekrarsiz elemanlari console a yazdiran kod.

       List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);


        for (Double w: prices ) {
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.println(w);
            }
        }



        //OR:Listteki tekrarli eleman olup olomadigini bulan kod yazalim.


        List<Integer> nums = List.of(2,3,13,3,5,1,2);

        int counter = 0;
        for (Integer w: nums
             ) {
            if (nums.indexOf(w) != nums.lastIndexOf(w)) {
                System.out.println(w);
                counter++;
                break;
            }
        }
            if (counter==0){
                System.out.println("Tekrarli karakter bulunmuyor");
            }else {
                System.out.println(" Tekrarli karakter bulunuyor.");
            }













    }
}
