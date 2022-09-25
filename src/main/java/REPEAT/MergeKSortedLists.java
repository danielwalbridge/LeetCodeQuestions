package REPEAT;


import LinkedList.ListNode;

import java.util.PriorityQueue;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.



Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output:
 */


public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        /*
        Maybe the most simple way to so this is to create a min heap
         */

        // create min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // go through each list in the array of lists, and add to the priority queue
        for (ListNode head: lists) {
            while (head!=null) {
                minHeap.add(head.val);
                head=head.next;
            }
        }

        // create new list, and a marker for it's head
        ListNode mergedList = new ListNode(-1);
        ListNode dummy = mergedList;

        // add new nodes to the merged list, while there is still elements in the queue.
        while (!minHeap.isEmpty()){
            mergedList.next= new ListNode(minHeap.remove());
            mergedList = mergedList.next; // move list to next
        }
        return dummy.next;
    }

    /*
    O(n*m log(n*m)) time
    O(n*m) space
    n = max # of lists
    m = max # of nodes in a list.
     */
}
