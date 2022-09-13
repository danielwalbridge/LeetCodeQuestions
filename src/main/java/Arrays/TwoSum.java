package Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if (nums.length <2) return nums;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            else {
                int key = target- nums[i];
                map.put(key, i);
            }
        }
        return new int[]{};
    }
}

/*
O(n) time : n = size of input array.
O(m) space : m = size of map created.
 */
