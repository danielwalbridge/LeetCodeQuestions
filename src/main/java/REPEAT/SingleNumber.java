package REPEAT;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */

import java.util.*;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        // if there is only 1 element we can just return it.
        if (nums.length == 1) {
            return nums[0];
        }

        HashSet<Integer> map = new HashSet<>();

        // we should be able to go through the array.
       // if its found 2 times, we remove it.

        for (Integer i: nums) {

            if (map.contains(i)) {
                map.remove(i);
            }
            else
                map.add(i);
        }

        Iterator<Integer> it = map.iterator();
        return it.next();

    }

    // O(n) runtime and space.
    // n = size of array.
}
