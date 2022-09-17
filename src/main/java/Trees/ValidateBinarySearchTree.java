package Trees;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

 Example 1:

         2
       /  \
     1      3
Input: root = [2,1,3]
Output: true


Example 2:
        5
       /  \
     1      4
           /  \
          3     6


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 */

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        // create a helper method for recursive call
        return validate(root,null,null);
    }

    /*
    use a recursive method that takes in:
     the current node
     the Max ( for left side validation)
     the min ( for right side validation)
     */
    public boolean validate(TreeNode node, Integer max, Integer min) {

        /*
        Base case
                if the current node is null, it is a BST
                -- it will have hit the level under the leaf nodes
         */
        if (node==null) {
            return true;
        }

        /*
            when are validating the left, we don't care how small it is, but we need to make sure
            that it is not larger or = the max

            when we are validating the right, we don't care how larger it is, but we need to make sure
            that it is not smaller or = the min
         */
        if (max!=null && node.val >=max || min!=null && node.val <= min) {
            return false;
        } else {
           /*
              else we have not hit the base case, and this subtree is a BST,
               we need to move down and validate both the left and the right of this node.
            */

                    /*
                      when validating left, we need to make sure that the values are not larger
                       -- the  values can be as small as they want, but can't be = or larger
                           than current nodes values
                     */
            return validate(node.left, node.val, min)
                    /*
                      when validating right, we need to make sure that the values are not smaller
                       -- the  values can be as large as they want, but can't be = or smaller
                           than current nodes values
                     */
                    && validate(node.right, max, node.val);
        }

    }

}

/*
O(n) time;
O(n) space:
n= number of nodes
 */
