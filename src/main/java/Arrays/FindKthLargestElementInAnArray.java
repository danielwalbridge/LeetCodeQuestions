package Arrays;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

import Trees.TreeNode;

import java.util.Collections;
import java.util.PriorityQueue;
/*
My thoughts were that I could use a min or max heap, however, I actually did not know how to use create one.

-> looked up this solution, will need to try again with this soon

 */

public class FindKthLargestElementInAnArray {



    public int findKthLargest(int[] nums, int k) {

        // creation of heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // this is not part of the problem, but I was curious on how to make a MaxHeap. so that is blow
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // we want to loop through and grab each int in the array.
        for (int i : nums) {
            // add the int to the minHeap.
            minHeap.add(i);
            // if the min heap size is greater than k, we can just remove it.
            if (minHeap.size() >k) {
                minHeap.remove();
            }
        }
        // since we removed as we went, the next element should be the kth element
        return minHeap.remove();
    }
}

/*
O(n) time

 */
