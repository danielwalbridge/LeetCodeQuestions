package LinkedList;


/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // if either of the lists are null, we can return the other list.
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // create a new list to merge.
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        // While both lists still have values
        while (list1 != null && list2 != null) {

            //if l1 val is less than l2 val
            // we need to place l1 val as next in the merged list
            if (list1.val < list2.val) {
                dummy.next = list1;
                // move l1 to next node.
                list1 = list1.next;
            } else { // else l2 value is less or = to l1 value -> need to place l2
                dummy.next = list2;
                // move l2 to next node;
                list2 = list2.next;
            }
            // need to move dummy to next val
            dummy = dummy.next;
        }

        // if list1 is not  empty.
        // Append the rest of list1
        if (list1 != null ) {
            dummy.next = list1;
        }
        // if list2 is not empty
        //Append the rest of list2
        else {
            dummy.next = list2;
        }
        return head.next;
    }

    /*
    O(l1 +l2) for time: l1 and l2 being the length of the linked lists.
    O(1) for space
     */
}
