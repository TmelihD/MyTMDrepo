package day18multidimentionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {


        //OR: 2 boyutlu bir array i tek boyutlu bir arraya ceviriniz.

        int numbers [][] = {{5,4},{2,3,2}};//== {5,4,2,3,2}


        int elements = 0;

        for ( int [] w : numbers) {
            elements = elements + w.length ;

        }
        int nums[] = new int[elements] ;

        int idx  = 0 ;
        for (int [] w :numbers){


            for (int k: w ) {
                nums[idx] = k ;
                idx++;
            }
        }
        System.out.println(Arrays.toString(nums));




    }
}
