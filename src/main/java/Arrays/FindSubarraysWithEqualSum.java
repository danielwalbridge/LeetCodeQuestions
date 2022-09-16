package Arrays;

/*
Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.

Return true if these subarrays exist, and false otherwise.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [4,2,4]
Output: true
Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.
Example 2:

Input: nums = [1,2,3,4,5]
Output: false
Explanation: No two subarrays of size 2 have the same sum.
Example 3:

Input: nums = [0,0,0]
Output: true
Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0.
Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.

 */

import java.util.HashSet;

public class FindSubarraysWithEqualSum {

    public static void main(String[] args) {
        int[] nums = new int[]{};
        FindSubarraysWithEqualSum findSubarraysWithEqualSum = new FindSubarraysWithEqualSum();

        System.out.println(findSubarraysWithEqualSum.findSubarrays(nums));
    }
    public boolean findSubarrays(int[] nums) {

       //Create HashSet to hold array totals
        HashSet<Integer> sumSet = new HashSet<>();

        //loop through the array.
        for (int i = 0; i < nums.length;i++) {
            int j = i+1;
            // if j is not out of bounds.
            if (j < nums.length) {
                // total sub array.
                int sum = nums[i] + nums[j];

                // if the same sum is already found in setMap, return true;
                if (sumSet.contains(sum)) {
                    return true;
                }
                // else add sum to sumSet;
                else
                    sumSet.add(sum);
            }
        }
        // return false, we never found two sub-arrays with equal sums.
        return false;
    }
}
/*
O(n) time : n is the size of the array.
O(n) space: n is the size of the HashSet, but will directly relate to whatever the size of the array is .

 */
