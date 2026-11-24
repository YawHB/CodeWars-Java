package kata_07;

import java.util.Arrays;
import java.util.List;


public class IsNarcissistic {
    public static boolean isNarcissistic(int input) {
        List<String> digits = Arrays.stream(String.valueOf(input).split("")).toList();
        int pow = digits.size();
        long sum = 0L;

        for(String digit : digits){
            sum +=  (int)Math.pow(Integer.parseInt(digit), pow);
        }
        return sum == input;
    }
}
