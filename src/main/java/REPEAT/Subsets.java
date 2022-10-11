package REPEAT;

/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

import java.util.ArrayList;
import java.util.List;


public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();

        generateSubsets(resultList,new ArrayList<>(), nums, 0);
        return resultList;
    }

    public void generateSubsets(List<List<Integer>> resultList, List<Integer> currentList, int[] nums, int index) {

        // add current list to result list
            resultList.add(new ArrayList<>(currentList));

        //loop through array.
        for (int i = index; i < nums.length; i++) {
            // add i to current list
            currentList.add(nums[i]);
            // generate taking next index.
            generateSubsets(resultList, currentList, nums, i+1);
            // remove last index
            currentList.remove(currentList.size()-1);
        }

    }

    /*
    O(2^n) time
    n = length of array
    O(n) space
     */

    /*
    I was very close to getting this problem by myself, will need to repeat at least once more

     */
}
