package Trees;

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */

import java.util.Stack;

public class MaximumDepthOfBinaryTree {

    public int maxDepthR(TreeNode root) {
        int depth = 0;
        if (root==null) {
            return depth;
        }

        return maxDepthR(root, depth);

    }

    public int maxDepthR(TreeNode root, int depth) {
        if (root== null) {
            return depth;
        }
        depth+=1;

        return Math.max(maxDepthR(root.left, depth), maxDepthR(root.right, depth));

    }
}
