package Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSums(nums3, target3)));
    }

    public static int[] twoSums(int[] nums, int target) {

        // HashMap to store the element's value and its position
        HashMap<Integer, Integer> storage = new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(storage.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = storage.get(target - nums[i]);
            } else {
                storage.put(nums[i], i);
            }
        }

        return result;
    }
}
