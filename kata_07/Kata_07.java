package kata_07;

import java.util.Arrays;

import static kata_07.IsNarcissistic.isNarcissistic;
import static kata_07.Order.order;
import static kata_07.PangramChecker.check1;
import static kata_07.PangramChecker.check2;
import static kata_07.SortItOut.sortItOut;

public class Kata_07 {

    public static void kata07(){
        //validateIsNarcissistic();
        //validateOrder();
        //validateSortItOut();
        // validatePangramChecker();
    }

        private static void validateIsNarcissistic() {
            System.out.println(isNarcissistic(153));
            System.out.println(isNarcissistic(1652));
        }
        private static void validateOrder() {
            System.out.println(order("is2 Thi1s T4est 3a!!"));
            System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));

        }
        private static void validateSortItOut() {
        System.out.println(Arrays.toString(
                sortItOut(new Double[]{11d, 22d, 33d, 44d, 55d, 55d, 90.4, 4d, 78d})));

    }
        private static void validatePangramChecker() {
            pangramChecker1();
            // pangramChecker2();
        }
        private static void pangramChecker1() {
        System.out.println(check2("Farmer jack realized that big yellow quilts were expensive."));
        System.out.println(check2("aaaa."));
    }
        private static void pangramChecker2() {
        System.out.println(check1("Farmer jack realized that big yellow quilts were expensive."));
        System.out.println(check1("aaaa."));
    }





}
