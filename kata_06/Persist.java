package kata_06;


// turn num into an array of strings (to get number of elements)

import java.util.ArrayList;
import java.util.List;


public class Persist {
    public static int persistence(long n) {
        int iterations = 0;

        while(n >= 10) {
       List<Integer> digitList = convertNumToList(n);
            int multiplied = digitList.stream().reduce(digitList.getFirst(),
                    (num1, num2) -> num1 * num2);
            System.out.println(multiplied);

        iterations++;
        n = multiplied;
        }
        return iterations;
    }

    private static List<Integer> convertNumToList(long n) {
        String numString = Long.toString(n);
            List<Integer> digitList = new ArrayList<>();
        for(int i = 0; i < numString.length(); i++) {
            int number = Character.getNumericValue(numString.charAt(i));
            digitList.add(number);
        }
        return digitList;
    }

    public static int persistence2(long n){
        int iterations = 0;

        while(n >= 10) {
         n = multiplyDigits(n);
         iterations++;
        }
        return iterations;
    }

    private static long multiplyDigits(long number) {
        long accumulator = 1;

        while(number >0) {
        long digit = number % 10;
        accumulator *= digit;
        number /= 10;
        }
        return accumulator;
    }
}