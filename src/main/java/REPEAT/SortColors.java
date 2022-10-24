package REPEAT;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

public class SortColors {
    public void sortColors(int[] nums) {

        // set pointers.
        int frontPointer = 0;
        int backPointer = nums.length-1;

        // set current index to the start.
        int currentIndex = 0;

        // loop through array.
        while (currentIndex <= backPointer && frontPointer < backPointer ) {

            // if we find a 0
            if (nums[currentIndex] == 0) {
                //current index needs to swap with front pointer
                nums[currentIndex] = nums[frontPointer];
                nums[frontPointer] = 0;

                currentIndex++;
                frontPointer++;

            }
            // if we find a 2
            else if (nums[currentIndex] == 2) {
                // current index needs to swap out with back index.
                nums[currentIndex] = nums[backPointer];
                // back index needs to be updated to 2
                nums[backPointer] =2;

                // we don't know what now is at the current index, so we don't move it forward.
                // we do know the last index is now a 2, so we can move that backward.
                backPointer--;
               }

            // else we have a 1;
            else {
                // just move current index forward
                currentIndex++;
            }
        }
    }

}
