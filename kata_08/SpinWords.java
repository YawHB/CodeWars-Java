package kata_08;

public class SpinWords {
    public static String spinWords(String sentence) {
       String[] words = sentence.split(" ");

        for(int i = 0;  i < words.length; i++) {
        if(words[i].length() >= 5 ) {
           words[i] = reverseWord(words[i]);
         }
        }
        return String.join(" ", words);
    }
    private static String reverseWord(String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
