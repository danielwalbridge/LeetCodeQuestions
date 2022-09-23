package REPEAT;

/*
Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].



Example 1:

Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:

Input: nums = [-1]
Output: [0]
Example 3:

Input: nums = [-1,-1]
Output: [0,0]

 */

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    // this will work, but it's a brute force approach with n^2 time, so for larger datasets it's bad news....
    // was not able to think of anything, and unsure if I want to doll out 35 a month to read leetcode solutions
//    public List<Integer> countSmaller(int[] nums) {
//
//        List<Integer> countsList = new ArrayList<>();
//
//        for (int i = 0; i<nums.length; i++) {
//            int count = 0;
//            for (int j = i+1; j< nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    count+=1;
//                }
//            }
//            countsList.add(count);
//        }
//        return countsList;
//    }

//    public List<Integer> countSmaller(int[] nums) {
//
//    }
}
