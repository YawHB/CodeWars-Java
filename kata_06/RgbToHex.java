package kata_06;

import java.util.HashMap;
import java.util.Map;


public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        Map<Integer, String> mapper = createMapper();
        String value1 = decimalToHexConverter(mapper, r);
        String value2 = decimalToHexConverter(mapper, g);
        String value3 = decimalToHexConverter(mapper, b);


        return value1 + value2 + value3;
    }

    private static String decimalToHexConverter(Map<Integer, String> mapper, int decimal) {
        String value = "";
        //StringBuilder builder = new StringBuilder();

        if(decimal <= 0)  return "00";
        if(decimal > 255) decimal = 255;
        if(decimal <= 9) return ( "0" + decimal);
        if(decimal <= 16) return ( "0" + mapper.get(decimal));

        System.out.println(decimal);
        while(decimal > 0) {

         int digit = decimal % 16;
         String hex = mapper.get(digit);
         value = hex + value;
         decimal = decimal / 16;
        }
        return value;
    }

    private static Map<Integer, String> createMapper(){
        Map<Integer, String> mapper = new HashMap<>();
        mapper.put(0, "0");
        mapper.put(1, "1");
        mapper.put(2, "2");
        mapper.put(3, "3");
        mapper.put(4, "4");
        mapper.put(5, "5");
        mapper.put(6, "6");
        mapper.put(7, "7");
        mapper.put(8, "8");
        mapper.put(9, "9");
        mapper.put(10, "A");
        mapper.put(11, "B");
        mapper.put(12, "C");
        mapper.put(13, "D");
        mapper.put(14, "E");
        mapper.put(15, "F");

        return mapper;
    }
}
