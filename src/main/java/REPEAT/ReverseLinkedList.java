package REPEAT;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 */

import LinkedList.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        // can use a stack.

        if (head== null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();

        // populate the stack

        while (head!=null) {
            stack.push(head);
            head = head.next;
        }

        // grab the new head of the reverse list from the stack.
        ListNode reverse = stack.pop();
        ListNode tale = reverse;
        // populate new list
        while (!stack.isEmpty()) {
            tale.next = stack.pop();
            tale = tale.next;
        }
        // terminate with null pointer
        tale.next= null;

    return reverse;
    }

    // O(N) time, O(N) space.
    // n = number of nodes in the linked list.
}
