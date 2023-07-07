package day34lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
        1- Lambda functional programing dir.digeri Structured programing ti(eski ogrendiklerimiz)
        2- Functional programing de ne yapilacak ( what to do) uzerine yogunlasilir.
           Structured da nasil yapilacak (how to do) uzerine yogunlasilir.
        3- Functional programing java8 ile kullanilmaya baslandi.
        4- Functional programing collectionlarda , arraylerde kullanilir.
         */

        java.util.List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();

        printElements1(nums);
        System.out.println();

        printElements3(nums);
        System.out.println();

        printElements4(nums);
        System.out.println();

        printSquareOdd(nums);
        System.out.println();

        printCubeOdd(nums);
        System.out.println();

        printSummOfsquaresOfDistinctEvenElements(nums);
        System.out.println();

        printDistinctSquaresMultiple(nums);
        System.out.println();

        getMaxValueList(nums);
        System.out.println();




    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

// 2 buda lamda da yapimi functioanal olan
    public static void printElement2(List<Integer> nums){
        nums.stream().forEach(t -> System.out.println(t + " "));
    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printElements3(List<Integer>nums){
        for (Integer w : nums ){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

//4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(functionala)

    public static void printElements4(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));
    }//Okunabilir ve pratik olmasi icin noktadan sonra bosluk birakilir.

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOdd (List<Integer>nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t-> t*t).
                forEach(t-> System.out.print(t+" "));
    }
//6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOdd (List<Integer>nums){
        nums.stream().
                distinct().
                filter(t-> t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }

//7)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSummOfsquaresOfDistinctEvenElements(List<Integer>nums){
       Integer sum = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t-> t*t).
                reduce(0,(t,u)-> t+u);

       System.out.println(sum);
    }
    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun
    public static void printDistinctSquaresMultiple (List<Integer>nums){
        Integer product = nums.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(1,(t,u)-> t*u);
        System.out.println(product);
    }
    //9)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1.yol
    public static void getMaxValueList(List<Integer>nums){
        Integer product1 = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u );
        System.out.println(product1);
    }
//2.yol
public static void getMaxValueList2(List<Integer>nums) {
    Integer product2 = nums.
            stream().
            distinct().
            reduce(nums.get(0), (t, u) -> t > u ? t : u);
    System.out.println(product2);
}

    //3.yol
    public static void getMaxValueList3 (List<Integer>nums) {
        Integer product3 = nums.
                stream().
                distinct().sorted().reduce((t, u) -> u).
                get();
        System.out.println(product3);
    }
    //4.yol
    public static void getMaxValueList4 (List<Integer>nums) {
        Integer product3 = nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
        System.out.println(product3);
    }
    //10)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        reduce((t, u) -> t > u ? u : t).
                        get();
        System.out.println(min);
    }

    //2.yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        reduce((t,u)->u).
                        get();
        System.out.println(min);
    }
    //3.yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t,u)->t).
                        get();
        System.out.println(min);
    }
    //4.yol
    public static void getMinValue4(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t,u)->Math.min(t,u)).
                        get();
        System.out.println(min);
    }

//11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
// 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

public static void print11(List<Integer> nums){
      Integer min =   nums.
              stream().
              filter(t-> t>7 && t%2==0).
              sorted().reduce((t,u)->t).
              get();
    System.out.println(min);
}






















}






















