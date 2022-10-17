package REPEAT;

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.


     1
   /   \
  9     20
       /  \
      15    7
 */

import Trees.TreeNode;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {

        // if the tree is empty.
        if (root == null) {
            return 0;
        }

        // check if we are at a leaf
        if (root.left == null && root.right == null) {
            return 1;
        }

        // either recursive call down to the left, or set to max value if the left subtree is null
        int leftDepth = root.left != null ?
                minDepth(root.left) : Integer.MAX_VALUE;

        // either recursive call down to the right, or set to max value if the right subtree is null
        int rightDepth = root.right != null ?
                minDepth(root.right) : Integer.MAX_VALUE;

        // add +1 from the min size
        return Math.min(leftDepth, rightDepth) + 1;
    }

    // O(N) time
    // n = max depth of the tree
    // O(1) space
}
