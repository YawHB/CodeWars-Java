package kata_05;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hours = seconds / 3600;
        int minutes = seconds % 3600 /60;
        int sec = seconds % 60 ;

        return addZeroPad(String.valueOf(hours) ) + ":" +
                addZeroPad(String.valueOf(minutes)) + ":"  +
                addZeroPad(String.valueOf(sec));
    }

    private static String addZeroPad(String num) {
        if(num.length() == 1) return "0"+num;
        return num;

    }
}
