package kata_07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean check1(String sentence){
        long count = sentence.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z').distinct().count();
        return count == 26;
    }

    public static boolean check2(String sentence){
        String[] letters = sentence.toLowerCase().replaceAll("[^a-z]", "").split("");
        Set<String> uniqueLetters = new HashSet<>(Arrays.asList(letters));
        return uniqueLetters.size() == 26;
    }
}
