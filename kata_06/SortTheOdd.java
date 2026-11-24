package kata_06;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortTheOdd(int[] array) {
        if(array.length == 0) return array;

        for(int i = 0; i < array.length / 2; i++){

            if(array[i] % 2 == 1) {


            for(int k = 0; k < array.length-i-1; k++){

                if( array[i] > array[k] && array[k] % 2 == 1){
                    System.out.println("BEFORE SWAP: " + Arrays.toString(array));
                    System.out.println("SWAPPING");
                    System.out.println("array[i]: " + array[i]);
                    System.out.println("array[k]: " + array[k]);

                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;

                    System.out.println("AFTER SWAP: " + Arrays.toString(array));
                    System.out.println("-----------------");
                    System.out.println();
                }
            }

           }
        }
        return array;
    }
}
