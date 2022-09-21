package Trees;

/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.



Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
 */

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        // base case
        if (low > high) {
            return null;
        }
        // find mid and create new node.
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        // find nodes left value
        node.left = helper(num, low, mid - 1);
        // find nodes right value
        node.right = helper(num, mid + 1, high);
        // return the node with it's populated right and left values.
        return node;
    }

    /*
Time complexity: O(N) since we visit each node exactly once.

Space complexity: O(N) to keep the output, and O(logN) for the recursion stack.
     */
}
