package kata_06;


/**
 * Remove the parentheses
 * In this kata you are given a string for example:
 *
 * "example(unwanted thing)example"
 * Your task is to remove everything inside the parentheses as well as the parentheses themselves.
 *
 * The example above would return:
 *
 * "exampleexample"
 * Notes
 * Other than parentheses only letters and spaces can occur in the string. Don't worry about other brackets like "[]" and "{}" as these will never appear.
 * There can be multiple parentheses.
 * The parentheses can be nested.
 * */

//TODO NOT SOLVED YET
public class RemoveParentheses {
    public static String removeParentheses(final String str) {
        int first =  str.indexOf('(');
        int last =  str.lastIndexOf(')');
        String before = str.substring(0, first);

        String after = str.substring(last+1);
        System.out.println("before: " + before);
        System.out.println("after: " + after);

         int two = Integer.parseInt("2");
        return before + after;
    }
}
