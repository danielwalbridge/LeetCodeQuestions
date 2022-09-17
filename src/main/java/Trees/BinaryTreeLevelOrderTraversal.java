package Trees;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values.
(i.e., from left to right, level by level).



Example 1:
              3
             /   \
           9       20
         /   \    /  \
      null  null 15  7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []



 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        // create the results list
        List<List<Integer>> resultsList = new ArrayList<>();

        if (root == null) { // base case
            return resultsList;
        }

            // create quote for holding child nodes.
            Queue<TreeNode> queue = new LinkedList<>();

            // place first node into the queue.
            queue.offer(root);

            // traverse tree while queue has children.
            while (!queue.isEmpty()) {

                // grab the current level size from queue.
                int levelSize = queue.size();

                // create a list for the current level.
                List<Integer> levelList = new ArrayList<>();

                // Need to loop through each node in this level.
                for (int i = 0; i < levelSize; i++) {
                    // grab the next from the queue.
                    TreeNode currentNode = queue.poll();
                    // add the current node to the level list
                    levelList.add(currentNode.val);

                    // check if current node has left val, and add it to queue
                    if (currentNode.left !=null) {
                        queue.offer(currentNode.left);
                    }
                    // check if current node has right val, and add it to the queue
                    if (currentNode.right !=null) {
                        queue.offer(currentNode.right);
                    }
                }
                // after we have looped through and added all TN in this current level
                // and added their child nodes to the queue
                // we need to add level list to results list.

                resultsList.add(levelList);
            }
            // once queue is empty we have traversed each TN in the tree and added each level to the results list
            // we can return the result list now.

        return resultsList;
    }
    }

    /*
    O(n) time
    O(n) space
    n = number of nodes in the tree
     */

