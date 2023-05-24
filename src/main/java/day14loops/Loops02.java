package day14loops;

public class Loops02 {
    public static void main(String[] args) {

        //OR: 5 den 8 e kadar olan tamsayilarin toplamini yaz
        //5+6+7+8==>26

        int sum =0;

        for (int i = 5 ; i<9 ; i++){
            sum=sum+i ;
        }
        System.out.println(sum);




        //OR: 7 den 9 a kodar olan sayilarin carpimi.


        int sum1 =1;

        for (int i = 7 ; i<10 ; i++){
            sum1=sum1*i ;
        }

        System.out.println(sum1);





        //verilen bir tam sayini rakamlarinin toplamini veren kod

       int toplam = 0;

       int num = -578;
       num = Math.abs(num);

       for (int i = num ;  i>0 ;  i=i/10){

           toplam=toplam +  i%10;
        }

       System.out.println(toplam);




























    }
}
