package kata_07;

import java.util.*;

public class SortItOut {
    public static Double[] sortItOut(Double[] array) {
        List<Double> odd = new ArrayList<>();
        List<Double> even = new ArrayList<>();

        for(Double number : array) {
            if(Math.floor(number) % 2 == 0) {
                even.add(number);
            } else{
                odd.add(number);
            }
        }
        odd.sort(Comparator.naturalOrder());
       even.sort(Comparator.reverseOrder());
        odd.addAll(even);

        Double[] sorted = new Double[odd.size()];
       return odd.toArray(sorted);

    }
}
