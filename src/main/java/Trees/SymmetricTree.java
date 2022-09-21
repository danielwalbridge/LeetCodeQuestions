package Trees;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 */

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetricR(TreeNode root) {
        // call recursive method to figure out.
        return isSymmetricR(root.left, root.right);
    }

    public boolean isSymmetricR(TreeNode left, TreeNode right) {

        // base case. if they are both null, they have both went past the leaf level
        if (left==null && right==null) {
            return true;
        }

        if (left==null || right ==null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        else {
            return isSymmetricR(left.left, right.right) && isSymmetricR(left.right , right.left);
        }
    }

    /*
    O(n
     */


    // Follow up: Could you solve it both recursively and iteratively?

    public boolean isSymmetric(TreeNode root) {

        // do some checks
        if (root== null) {
            return true;
        }
        if (root.left== null && root.right== null) {
            return true;
        }
        if (root.left==null || root.right == null) {
            return false;
        }
        if (root.left.val!= root.right.val) {
            return false;
        }

        // create queue and add its left and right nodes to it
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            // grab current node.
            TreeNode currentNodeOne = queue.poll();
            TreeNode currentNodeTwo = queue.poll();

            // do checks.
            // if they are both null, we have reached past the leaf level and can just continue in the loop
            if (currentNodeOne==null && currentNodeTwo==null) {
                continue;
            }
            // if the sub-trees are not even lengths, false
            if (currentNodeOne==null ||currentNodeTwo==null) {
                return false;
            }
            // if the nodes being compared are not the same, false
            if (currentNodeOne.val != currentNodeTwo.val) {
                return false;
            }

            // add to the queue.
            queue.add(currentNodeOne.left);
            queue.add(currentNodeTwo.right);
            queue.add(currentNodeOne.right);
            queue.add(currentNodeTwo.left);
        }
        // if we found no issues, it's true
        return true;
    }

    // O(N) time and space on both.
    // n = number of nodes
}
