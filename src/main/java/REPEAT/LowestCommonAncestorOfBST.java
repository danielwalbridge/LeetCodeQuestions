package REPEAT;

/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia:
“The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants
(where we allow a node to be a descendant of itself).”


Example 1:

            6
           / \
          2   8
         / \ /  \
        0  4 7   9

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.



Constraints:

The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the BST
 */

import Trees.TreeNode;

public class LowestCommonAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // traverse left.
        if (p.val < root.val && q.val < root.val) {
            lowestCommonAncestor(root.left, p,q);
        }

        // traverse right.
        if (p.val > root.val && q.val > root.val) {
            lowestCommonAncestor(root.right, p,q);
        }

        return root;
    }

    // We will return the root if both are not on the left or right. If one is on the left, and one is on the right, or one is equal...Then we know we have foudn the LCA

    //  O(n) + recursive space, can be done iteratively for O(1) space
}
