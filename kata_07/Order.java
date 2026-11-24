package kata_07;

import static java.lang.Integer.parseInt;

public class Order {
    public static String order(String sentence) {
        if(sentence.isEmpty()) return "";
        String[] words = sentence.split(" ");
        String[] ordered = new String[words.length];

        for (String word : words) {
            int index = parseInt(word.replaceAll("\\D", ""));
            ordered[index - 1] = word;
        }
       return String.join(" ", ordered);
    }
}
