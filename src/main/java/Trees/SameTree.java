package Trees;

/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 */

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTreeR(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        // the values are not the same
        if (p.val != q.val) return false;

        return isSameTreeR(p.right, q.right) &&
                isSameTreeR(p.left, q.left);
    }

    /*
    O(n) time and space, where n = number of nodes
     */

    // itt approach

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // create a queue
        Queue<TreeNode> queue = new LinkedList<>();

        // do initial checks
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;

        // place both in queue.
        queue.offer(p);
        queue.offer(q);

        // traverse while queue has values
        while (!queue.isEmpty()) {
            // grab the first two elements in line.
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

            // checks
            // if they are both null we have went past the leaf nodes, and can just continue with the next itter
            if (first == null && second == null)
                continue;
            // false if they are not the same length
            if (first == null || second == null)
                return false;
            // false if they are not the same value
            if (first.val != second.val)
                return false;

            // add left and right values of each to queue.
            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);
        }

        // if we found no issues, we can return true.
        return true;
    }
}
