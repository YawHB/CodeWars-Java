package kata_08;


public class Trolls {
    public static String disemvowel(String str) {
        if(str != null)  {

            /**ReplaceAll takes a regex and a replacement**/
           return str.replaceAll("[aeouiAEOUI]", "");

            /**We could also ude (?i) which means the regex is case-insensitive
                return str.replaceAll("(?i)[aeoui]","");
             **/

        }
        return "INVALID INPUT";
    }
}