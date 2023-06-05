package day19passbyvaluesmethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        //Note: Pass by value sayasende variable s orjinal degerini korur.

        int shirtPrice=100;

        System.out.println(shirtPrice);
        System.out.println(discount("student", shirtPrice));

        //Java orjinal degerin bir kopyasini olusturu ve biz bununla islem yapariz.



    }

    public static int discount(String type, int price){
        switch (type){
            case "student" :
               price = price-10;
               break;
            case "veteran" :
                price = price-20;
                break;
            case "senior" :
                price = price-5;
                break;
            default: price = price ;



        }
        return price;
    }

}
