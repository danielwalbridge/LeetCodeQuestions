package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        // want to create the results list.
        List<Integer> inorderList = new ArrayList<>();
        // call helper recursive method
        inorderTraversal(root, inorderList);

        return inorderList;

    }

    public void inorderTraversal(TreeNode root, List<Integer> inorderList) {

        // inorder goes left, root, right.
        if (root != null) {
            inorderTraversal(root.left, inorderList);
            inorderList.add(root.val);
            inorderTraversal(root.right, inorderList);
        }
    }

    /*
    O(n) time and space complexity.
    n = number of nodes.
     */

    //Follow up: Recursive solution is trivial, could you do it iteratively?

    public List<Integer> inorderTraversalI(TreeNode root) {

        // create results list
        List<Integer> resultList = new ArrayList<>();

        // create stack
        Stack<TreeNode> stack = new Stack<>();

        // grab current node
        TreeNode currentNode = root;

        // traverse while currentNode is not = null or while there is something in the stack
        while (currentNode!=null || !stack.isEmpty()) {

            // while the current node is not null add left
            while (currentNode!=null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            // after we have added all we can to the left, update current node by popping off stack
            currentNode = stack.pop();
            // add to result list
            resultList.add(currentNode.val);
            //move current node over to the right
            currentNode= currentNode.right;
        }
        return resultList;
    }

    /*
    time and space are still O(n)
     */

}

