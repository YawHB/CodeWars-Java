package kata_04;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static String toRoman(int n) {
        Map<Integer, String> romanNumerals = new HashMap<>();
        String[] numbers = String.valueOf(n).split("");

        for(int i = 0; i<numbers.length; i++) {

        }

        return "I";
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }
}
