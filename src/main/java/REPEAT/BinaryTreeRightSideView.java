package REPEAT;

/*
Given the root of a binary tree, imagine yourself standing on the right side of it,
return the values of the nodes you can see ordered from top to bottom.

      1
    /   \
   2     3
    \     \
     5     4
Example 1:


Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Example 2:

Input: root = [1,null,3]
Output: [1,3]
Example 3:

Input: root = []
Output: []
 */

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    /*
    TIP when looking top to bottom on trees think BFS
     */
    public List<Integer> rightSideView(TreeNode root) {
        // create result list
        List<Integer> result = new ArrayList<>();
        // null check
        if (root == null) {
            return result;
        }
        // create queue
        Queue<TreeNode> queue = new LinkedList<>();
        // add the root ro the queue
        queue.add(root);
        // while there are things in the queue we need to process them
        while (!queue.isEmpty()) {
            // grab the current level of the queue
            int levelSize = queue.size();
            // go through the current level
            for (int i =0; i < levelSize; i ++) {
                // grab the current node from queue
                TreeNode currentNode = queue.remove();
                // if it's the last element
                if (i == levelSize-1) {
                    // add the value
                    result.add(currentNode.val);
                }
                // add left child to queue
                if (currentNode.left!=null) {
                    queue.add(currentNode.left);
                }
                // add right child to queue
                if (currentNode.right!=null) {
                    queue.add(currentNode.right);
                }

            }

        }
        return result;
    }

    /*
    O(n) time
    o(n) memory
    n = number of nodes
     */

}
