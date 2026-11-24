package kata_06;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        int[] matches = new int[2];

        for(int i = 0; i<numbers.length -1; i++) {

            for(int k = i+1; k<numbers.length; k++ ){
                 if(numbers[i] + numbers[k] == target){
                   matches[0] = i;
                   matches[1] = k;
                 }
            }
        }
        return matches;
    }
}
