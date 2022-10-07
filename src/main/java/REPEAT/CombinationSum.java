package REPEAT;

/*
Given an array of distinct integers candidates and a target integer target,
 return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times.
 Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.



Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []

 */

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // create the results list
        List<List<Integer>> combinationList = new ArrayList<>();

        // check
        if (candidates==null || candidates.length==0) {
            return combinationList;
        }

        // call recursion method to fill list.
        combinationListGenerator(combinationList, candidates, target,0, new ArrayList<>());

        return combinationList;
    }

    public void combinationListGenerator(List<List<Integer>> combinationList, int[] candidates, int target, int currentListSum, List<Integer> currentList) {

        // add list if the current list sum is == target
        if (currentListSum == target) {
            combinationList.add(currentList);
            return;
        }


        // loop through the candidates
        for (int i = 0; i < candidates.length; i++) {

            // check if the element is less than target && element + currentSum is less than or equal to target.
            if (candidates[i] < target && currentListSum + candidates[i] <= target) {
                currentList.add(candidates[i]);
                currentListSum = currentListSum + candidates[i];
                combinationListGenerator(combinationList, candidates, target, currentListSum, currentList);

                // check if cL had elements
            }
            if (!currentList.isEmpty()) {
                int elementRemoved = currentList.remove(currentList.size() - 1);
                currentListSum = currentListSum - elementRemoved;
            }
        }
    }

//    Input: candidates = [2,3,5], target = 8
//    Output: [[2,2,2,2],[2,3,3],[3,5]]
//    Example 3:


    // I'm on the right track I feel, but was unable to get it in the 30 mins.

    //todo look and and understnad backtracking and perutations better



}
