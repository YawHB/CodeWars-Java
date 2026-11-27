package kata_05;

import java.util.ArrayList;
import java.util.List;

public class MeanSquareError {
    public static double meanSquareError(int[] arr1, int[] arr2) {
        List<Double> numsSquared = new ArrayList<>();
        int length = arr1.length;
        for(int i = 0; i < length; i++) {

            numsSquared.add(Math.pow(((arr1[i] - arr2[i])), 2));
        }
            double sum = numsSquared.stream().reduce(0.0, (num1, num2) -> num1 + num2);
            return sum/numsSquared.size();
    }
}
