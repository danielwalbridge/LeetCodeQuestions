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
import java.util.HashMap;


public class IntersectionOfTwoArrays {

    public int[] intersection ( int[] nums1, int[] nums2) {

        if(nums1.length < 1 || nums2.length < 1 || nums1 == null || nums2 == null) {
            return new int[]{};
        }

        ArrayList<Integer> intersections = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number:nums1) {
            if (!map.containsKey(number)) {
                map.put(number, 0);
            }
        }

        for (int number:nums2) {
            if (map.containsKey(number) && map.get(number) == 0) {
                intersections.add(number);
                map.replace(number, 0, 1);
            }
        }

       return intersections.stream().mapToInt(i -> i).toArray();
    }

    /*
    Big O
    Time:O(N + M)
    Space: O(N)
    N = length of nums1
    M = length of nums2


    We could do a trade off to save space by not using a HM, but in return we would need more time.
    The steps I could think of in this would be to sort the arrays, then search through both of them while building the result array

     */

}
