package kata_04;

import static kata_04.RomanNumerals.toRoman;
import static kata_04.StripComments.stripComments;

public class Kata_04 {

    public static void kata04(){
        //validateRomanNumerals();
        validateStripComments();
    }

    private static void validateStripComments() {
        String[] symbols =  {"#", "!"};
        System.out.println(stripComments("apples, pears # and bananas\n" +
                "grapes\n" +
                "bananas !apples", symbols));
    }

    private static void validateRomanNumerals() {
        System.out.println(toRoman(1990));
        //System.out.println(fromRoman(""));

    }
}
