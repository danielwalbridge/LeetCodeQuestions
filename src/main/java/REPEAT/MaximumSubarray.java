package REPEAT;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */

public class MaximumSubarray {

    // Kadane algoritum.

    public int maxSubArray(int[] nums) {

        // need to current and max values.
        int currentSubArrayValue = nums[0];
        int maxSubArrayValue = currentSubArrayValue;

        // need to loop though the array
        for (int i = 1; i < nums.length; i++) {
            // update current
            // we are checking if we want to continue the previous subarray, or start over at i
            currentSubArrayValue = Math.max(currentSubArrayValue + nums[i], nums[i]);

            // check if we need to update max, based off of current and previous max
            Math.max(currentSubArrayValue, maxSubArrayValue);
        }

            // return the max value of con subarray
    return maxSubArrayValue;
    }

    // O(n) time
    // O(1) space
    // n = number of elements in nums array


}
