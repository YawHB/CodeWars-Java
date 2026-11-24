package kata_06;

import java.sql.Array;
import java.util.Arrays;

import static kata_04.SumStrings.sumStrings;
import static kata_06.Compare.compare;
import static kata_06.Persist.persistence;
import static kata_06.Persist.persistence2;
import static kata_06.RemoveParentheses.removeParentheses;
import static kata_06.RgbToHex.rgb;
import static kata_06.SortTheOdd.sortTheOdd;
import static kata_06.TwoSum.twoSum;
import static kata_06.WhoLikesIt.whoLikesIt;

public class Kata_06 {

    public static void kata06(){
        //validateCompare();
        //validatePersist();
        //validateRemoveParentheses();
        //validateSortTheOdd();
        //validateWhoLikesIt();
        //validateTwoSum();
        //validateRgbToHex();
        //validateSumStrings();

    }

    private static void validateSumStrings() {
       // System.out.println(sumStrings("123","321"));
       // System.out.println(sumStrings("135","247"));
        //System.out.println(sumStrings("246","135"));
        System.out.println(sumStrings("246","935"));
        System.out.println(sumStrings(
                "00103",
                "08567"));

       //String value = ("a".substring(0, -1));


    }

    private static void validateRgbToHex() {
       /* System.out.println(rgb(123,123,123));
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(254, 253, 252));
        System.out.println(rgb(-20, 275, 125));

        System.out.println(rgb(200, 200, 200));
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(1, 2, 3));
        System.out.println(rgb(1, 1, 1));
        */
        System.out.println(rgb(328, 11, 68));

    }

    private static void validateTwoSum() {
        //System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 4)));
        //System.out.println(Arrays.toString(twoSum(new int[]{1234,5678,9012}, 14690)));
       // System.out.println(Arrays.toString(twoSum(new int[]{2,2,3},4)));
       System.out.println(Arrays.toString(twoSum(new int[]{2,3,1},4)));

    }

    private static void validateWhoLikesIt() {
        String[] noName = {};
        String[] oneName = {"John"};
        String[] twoNames = {"John", "Alex"};
        String[] threeNames = {"John", "Alex", "Max"};
        String[] fourNames = {"John", "Alex", "Max", "Mark"};
        String[] fiveNames = {"John", "Alex", "Max", "Mark", "James"};
        System.out.println(whoLikesIt(noName));
    }




    private static void validateCompare() {
        System.out.println("true: " + compare("AD", "BC"));
        System.out.println("false: "+ compare("AD", "DD"));
        System.out.println("true: " + compare("gf", "FG"));
        System.out.println("true: "+ compare("zz1", " "));
        System.out.println("true: "+ compare("", " "));

    }

    private static void validatePersist() {
        //persistSolutionOne();
        //persistSolutionTwo();
    }

    private static void persistSolutionTwo() {
        System.out.println(persistence2(200));
        //System.out.println(persistence2(123));
        //System.out.println(persistence2(4));

    }

    private static void persistSolutionOne() {
        System.out.println(persistence(39));
        //System.out.println(persistence(123));
        //System.out.println(persistence(4));

    }

    private static void validateRemoveParentheses() {
        //System.out.println(removeParentheses("example(unwanted thing)example"));
        //System.out.println(removeParentheses("a(b(c))"));
        System.out.println(removeParentheses("(first group) (second group) (third group)"));
    }

    private static void validateSortTheOdd() {
        System.out.println(Arrays.toString(sortTheOdd(new int[]{10,5, 3, 2, 8, 1, 4})));
        System.out.println(Arrays.toString(sortTheOdd(new int[]{10,15, 3, 1, 8, 7, 4})));
        // System.out.println(Arrays.toString(sortTheOdd(new int[]{ 1, 3, 5, 8, 0 })));
        //System.out.println(Arrays.toString(sortTheOdd(new int[]{})));

    }
}
