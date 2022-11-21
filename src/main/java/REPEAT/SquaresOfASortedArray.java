package REPEAT;

/*
Given an integer array nums sorted in non-decreasing order,
 return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.


Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

import java.util.PriorityQueue;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        if (nums.length ==0 || nums == null) {
            return null;
        }

        int[] squared = new int[nums.length];

        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                int squaredNumber = nums[i] * nums[i];
                squared[i] = squaredNumber;
            }
            return squared;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            int squaredNumber = nums[i] * nums[i];
            queue.add(squaredNumber);
        }

        for (int j = 0; j < nums.length; j++) {
            squared[j] = queue.remove();
        }
        return squared;
    }

    /*
    Big O
    Time: O(n) where n = length of nums
    Space: O(n) where n = length of nums
     */
}
