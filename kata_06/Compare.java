package kata_06;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    public static boolean compare(String s1, String s2) {

        List<String> strings = new ArrayList<>();
        strings.add(s1.toUpperCase());
        strings.add(s2.toUpperCase());

        for(int i = 0; i < strings.size();  i++) {
            boolean isMatch = strings.get(i).matches("[A-Z]+");
            boolean isNull = strings.get(i) == null;
            if(!isMatch || isNull) strings.set(i, "");
        }
        int value1 = strings.get(0).chars().sum();
        int value2 = strings.get(1).chars().sum();
       return value1 == value2;

    }
}
