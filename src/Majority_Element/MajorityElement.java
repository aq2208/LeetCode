package Majority_Element;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {1};
        System.out.println(majorityElement2(nums));
    }

    //Solution 1 - my code
    public static int majorityElement(int[] nums) {
        int criteria = nums.length / 2;
        //number, frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int frequency = map.get(nums[i]);
                map.put(nums[i], ++frequency);

                if(map.get(nums[i]) > criteria) {
                    return nums[i];
                }

            } else {
                map.put(nums[i], 1);

                if(map.get(nums[i]) > criteria) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    //Solution 2 - Follow up
    public static int majorityElement2(int[] nums) {
        int result = 0;
        int count = 0;

        for(int i : nums) {
            if(count == 0) {
                result = i;
            }

            if(i == result)
                ++count;
            else
                --count;
        }

        return result;
    }
}
