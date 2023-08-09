package Minimum_Common_Value;

import java.util.*;

public class MinimumCommonValue {
    public static void main(String[] args) {

    }

    //Using Two Pointers
    public static int getCommon(int[] nums1, int[] nums2) {
        //Two pointers, each pointer point to the first element of each array
        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if(nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else if (nums1[pointer1] > nums2[pointer2]) {
                pointer2++;
            } else {
                return nums1[pointer1];
            }
        }

        return -1;
    }

    //Using HashSet
    public static int getCommon2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums1) {
            set.add(i);
        }

        for(int i : nums2) {
            if(set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
