package kata_08;

import java.util.Arrays;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String stringNumber = Arrays.toString(numbers);
        String newSub = stringNumber.substring(1, stringNumber.length()-1).replace(", ", "");
        String first = "(" + newSub.substring(0,3)+ ") ";
        String second = newSub.substring(3,6) + "-";
        String last = newSub.substring(6) ;
        return first + second + last;

    }
}
