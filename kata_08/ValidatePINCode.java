package kata_08;

public class ValidatePINCode {

// return true when string is valid
    //return true when only 4 or 6 digits are present

    public static boolean validatePin(String pin) {

        String stringNum = "\\d";
        if(!pin.matches(stringNum)) return  false;

        if(pin.length() == 4 || pin.length() == 6) return true;
        return false;
    }
}

