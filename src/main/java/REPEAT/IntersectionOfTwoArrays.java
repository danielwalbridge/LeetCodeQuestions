package REPEAT;

/*
Given two integer arrays nums1 and nums2,
 return an array of their intersection.
 Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

import java.util.ArrayList;
import java.util.Collections;

public class IntersectionOfTwoArrays {

    public int[] intersection ( int[] nums1, int[] nums2) {

        // find the length of each array
        int num1Length = nums1.length;
        int num2Length = nums2.length;

        // grab the smaller of the arrays, since this can be the max amount of intersections.
        int smallerLength = Math.min(num1Length,num2Length);

        // create a new array for result
        ArrayList<Integer> result = new ArrayList<>();

        // set index for traversal
        int i = 0;
        while (i < smallerLength) {
            if (nums1[i] == nums2[i]) {
                result.add(nums1[i]);
            }
            i++;
        }
        int[] resultArray = result.stream().mapToInt(l -> l).toArray();
        return resultArray;

    }

    // mis understood problem. will need to come back and try again
}
