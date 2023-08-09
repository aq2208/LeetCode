package Contains_Duplicate;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                return true;
            } else {
                map.put(num, num);
            }
        }

        return false;
    }

}
