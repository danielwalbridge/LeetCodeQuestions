package Arrays;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

 */



public class SearchInsertPosition {

    public  int searchInsertR(int[] nums, int target) {


        return searchInsertR(nums, target, 0, nums.length - 1);
    }

    public int searchInsertR(int[] nums, int target, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {// base case
            if (target <= nums[lowIndex]) {
                return lowIndex;
            }
            else {
                return lowIndex + 1;
            }
        }

        int halfIndex = lowIndex + (highIndex - lowIndex) / 2;

        if (nums[halfIndex] < target) { // to low, need to move right
            return searchInsertR(nums, target, halfIndex + 1, highIndex);
        } else if (nums[halfIndex] > target) { // to high, need to move left
           return searchInsertR(nums, target, lowIndex, highIndex - 1);
        }
        return halfIndex; // just right
    }

    /*
    Recursive approach above
    Itt approach below.

    Itt pros
    The itt approach deals with less edge cases ( as you can see I needed to deal with in my base case for recursion)
    the itt approach also does not have the extra space on the call stack.
    O(log n) time : n = size of array
    O(1) space

    Rec pros
    A little easier to read ( maybe)
    O(log n) time: n = size of array
    O(log n) space: n = size of array for calls
     */

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high= mid -1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}
