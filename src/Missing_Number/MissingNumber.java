package Missing_Number;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber2(nums));

    }

    public static int missingNumber(int[] nums) {

        List<Integer> standard = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++) {
            standard.add(i);  //0, 1, 2, 3
        }

        for(int i = 0; i < nums.length; i++) {
            if(standard.contains(nums[i])) {
                standard.remove(Integer.valueOf(nums[i]));
            }
        }
        return standard.get(0);
    }

    //The sum solution
    public static int missingNumber2(int[] nums) {
        int sumOfRange = 0;
        for(int i = 0; i <= nums.length; i++) {
            sumOfRange+=i;
        }

        int sumOfArray = 0;
        for(int i = 0; i < nums.length; i++) {
            sumOfArray+=nums[i];
        }

        return sumOfRange - sumOfArray;
    }
}
