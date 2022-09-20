package HashTable;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.



Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

 */

import LinkedList.ListNode;

import java.util.HashSet;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        // create a set to hold ListNodes
        HashSet<ListNode> set = new HashSet<>();
        // Grab current node
        ListNode currentNode = head;
        // can loop through the linked list.
        while (currentNode!=null) {
            // check if the set holds this listNode.
            // if it already holds the node, then we have found a cycle and can return true.
            if (set.contains(currentNode)) {
                return true;
            } else {
                // else we have not been to this node, and we can add it to the set.
                set.add(currentNode);
                // move to next node
                currentNode = currentNode.next;
            }
        }
        // if we ever break out of the list that means there is no cycle ,and we can just return false
        return false;
    }

    /*
    O(n) time and space;
    n = number of nodes in the LinkedList
     */


    /*
    Follow up: Can you solve it using O(1) (i.e. constant) memory?
     */

    public boolean hasCycleTwo(ListNode head) {

        // quick check
        if (head==null|| head.next==null) {
            return false;
        }
        // set two pointers
        ListNode slow = head;
        ListNode fast = head.next;

        // if they ever equal each other, we know we have an overlap
        while (slow!=fast) {
            if (fast==null|| fast.next==null) {
                return false;
            }
            slow= slow.next;
            fast = fast.next.next;
        }
        // if we bust out of the loop then we know there is a cycle
        return true;
    }

    /*
    we are now using constant memory, however, we may very well have to loop many times before we find the cycle
     */
}
