package Arrays;


/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
 An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.



Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false



 */
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        // initial check
        if (nums.length<=1) {
            return true;
        }

        // create some varibles for checking
        int i  = 0;
        int j = 1;
        // move forward until the elements are not the same.
        while (j < nums.length &&nums[i]== nums[j])  {
            i++;
            j++;
        }
        // if we looped through and they were always the same, j will be equal to length of array
        // so we can just return true
        if (j == nums.length) {
            return true;
        }

        // looking increasing
        if (nums[i] < nums[j]) {
            // loop through array
            for (int m = i; m < nums.length; m++) {
                int n = m+1;
                // check if in bounds
                if (n < nums.length) {
                    if (nums[m] > nums[n]) {
                        return false;
                    }
                }
            }
        }

        // looking for inc mon array
        else {
            for (int m = i; m < nums.length; m++) {
                int n = m+1;
                // check if in bounds
                if (n < nums.length) {
                    if (nums[m] < nums[n]) {
                        return false;
                    }
                }
            }
        }
        // if we get here and never have issues, it's true
        return true;
    }

    /*
    O(1) space
    O(n) time
    n = length of array
     */
}
