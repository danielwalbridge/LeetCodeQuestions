package Arrays;

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

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        int[] nums = new int[]{1,2,3};
        subsets.subsets(nums);
    }

    public List<List<Integer>> subsets (int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
      generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
      return subsets;
    }

    public void generateSubsets(int index, int[] nums, List<Integer> currentList, List<List<Integer>> subsets) {
        // start off by adding a copy of the current list to the subset list.
        subsets.add(new ArrayList<>(currentList));


        // for whatever index we are currently on, unto nums. length
        // we need to simulate both taking and not taking the number.
        for (int i =index; i< nums.length; i++) {
            // take the number at index
            currentList.add(nums[i]);
            generateSubsets(i+1, nums, currentList,subsets);
            // after the recursive function returns we remove to simulate removing it
            currentList.remove(currentList.size()-1);
        }
    }
}

/*

O(2^n) for time.
O(n) deep as the stack call.
n = length of nums
2^n since for reach n we need to take or not take
 */

