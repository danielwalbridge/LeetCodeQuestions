package Arrays;

import Strings.PermutationSequence;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 */

public class Permutations {

    // I was on the right track, but was unable to get it

    public static void main(String[] args) {
        Permutations permutation = new Permutations();
        permutation.permute(new int[]{1,2,3});
    }


    public List<List<Integer>> permute(int[] nums) {

        // create the results list
        List<List<Integer>> resultsList = new ArrayList<>();
        // use a recursive call to populate the list
        backtrack(resultsList, new ArrayList<>(), new boolean[nums.length], nums);
        return resultsList;
    }
    private void backtrack(List<List<Integer>> resultList, List<Integer> tempList, boolean[] visited, int[] nums) {

        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        // loop through the array.
        for (int i = 0; i < nums.length; i++) {
            // if its visited we can continue with the loop
            if (visited[i] == true) {
                continue;
            }
            // set visited to true
            visited[i]= true;
            // add number to list
            tempList.add(nums[i]);
            // call recursion to populate the rest of the list.
            backtrack(resultList, tempList, visited, nums);
            // after the list is populated and added to result, we end up here and need to change to false so give elements the
            // chance to swap
            visited[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }

    /*
    O(n!) space
    O(n^2) time
     */
}
