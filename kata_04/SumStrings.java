package kata_04;

import java.util.Map;

/****
 * Given the string representations of two integers, return the string representation of the sum of those integers.
 *
 * For example:
 *
 * sumStrings('1','2') // => '3'
 * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
 *
 * I have removed the use of BigInteger and BigDecimal in java
 */

public class SumStrings {
    public static String sumStrings(String a, String b) {
       if (a.isEmpty() && b.isEmpty()) return "0";

        StringBuilder builder = new StringBuilder();

          /*
        int longestNum = Math.max(a.length(), b.length());
            a = "0".repeat(longestNum - b.length() +1) + a;
            b = "0".repeat(longestNum - a.length() +1) + b;
           */

        if(a.length() > b.length()) {
            String zeroPadding = "0".repeat(a.length() - b.length());
            b = zeroPadding + b;
        } else if(b.length() > a.length()) {
            String zeroPadding = "0".repeat(b.length() - a.length());
            a = zeroPadding + a;

        }
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

            int carry = 0;
            int current;
            //StringBuilder resultString = new StringBuilder();
            String resultString = "";
        for (int i = a.length() - 1; i >= 0; i--) {

            int num1 = Integer.parseInt(a.substring(i,i+1));
            int num2 = Integer.parseInt(b.substring(i,i+1));


            if(num1 + num2 + carry >= 10) {
                current = (num1 + num2 + carry) % 10;
                //resultString.append(current);
                resultString = current + resultString;
                carry = (num1 + num2 + carry) / 10;
            } else {
                current = (num1 + num2 + carry) % 10;
               // resultString.append(current);
                resultString = current + resultString;
                carry = 0;
            }
        }
        if(carry >= 1) resultString = carry + resultString;

        while(resultString.length() > 1 && resultString.charAt(0) =='0'){
            resultString = resultString.substring(1);
        }
        return resultString;
    }


}
