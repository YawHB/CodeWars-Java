package kata_08;

import java.util.List;

import static kata_08.CreatePhoneNumber.createPhoneNumber;
import static kata_08.FilterFriends.filterFriends;
import static kata_08.SpinWords.spinWords;
import static kata_08.ValidatePINCode.validatePin;

public class Kata_08 {

    public static void kata08(){

    // validateCreatePhoneNumber();
    //validateFilterFriends();
    // validateSpinWords();
    //validateTrolls();
    //validatePINCodeTests();
    }



    private static void validateCreatePhoneNumber() {
        System.out.println(createPhoneNumber(
                new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    private static void validateFilterFriends() {
        System.out.println(filterFriends(List.of("Hans", "John", "hell")));

    }
    private static void validateSpinWords() {
        System.out.println( spinWords("Hey fellow warriors")); // Expected: Hey wollef sroirraw
        System.out.println(spinWords("This is a test"));       // Expected: This is a test
        System.out.println(spinWords("These words flip"));     // Expected: esehT sdrow flip

    }
    private static void validateTrolls(){
        System.out.println(Trolls.disemvowel("hahahah"));;
        System.out.println(Trolls.disemvowel("HAHAHAHA"));;
        System.out.println(Trolls.disemvowel("What are you, a communist? diiid"));
        System.out.println(Trolls.disemvowel("Ice, ice"));;
        //System.out.println(Trolls.disemvowel(null));

    }
    private static void validatePINCodeTests(){
        System.out.println("expect true: " + "got " +
                validatePin("1234"));
        System.out.println("expect false: " + "got " +
                validatePin("12345"));
        System.out.println("expect true: " + "got " +
                validatePin("123456"));
        validatePin("abc");
        System.out.println("expect false: " + "got " +
                validatePin("abc7"));
    }
}
