package REPEAT;

/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.



Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 */

import LinkedList.ListNode;

import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {

        // create a stack
        Stack<ListNode> stack = new Stack<>();

        int length = 0;

        // populate stack
        ListNode current = head;
        while (current!=null) {
            stack.add(current);
            current= current.next;
            length++;
        }

        int stackPops = length /2;
        // reset current
         current = head;
        while (!stack.isEmpty() || stack.peek()!= current || stackPops!=0) {
            ListNode next = current.next;
            current.next = stack.pop();
            current.next.next= next;
            current=next;
            stackPops--;
        }


    }

    // this is what I came up with at first, It's close I feel.

    /*
    go to half way point
    break into 2 lists
    reverse second list
    reorder.
     */
}
