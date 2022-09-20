package HashTable;

/*
Given the heads of two singly linked-lists headA and headB,
return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:


The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
 */

import LinkedList.ListNode;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA==null || headB == null) {
            return null;
        }
        ListNode currentA = headA;
        ListNode currentB = headB;

        // create a set to hold the nodes
        HashSet<ListNode> set = new HashSet<>();

        // loop through list a and add all nodes.
        while (currentA!=null) {
            set.add(currentA);
            currentA = currentA.next;
        }

        // loop through list b and add all nodes
        while (currentB!=null) {
            // do a check if there is every a node fround from A, if there is this is where they intersect.
            if (set.contains(currentB)) {
                return currentB;
            }
            currentB= currentB.next;
        }
        return null;
    }

    /*
    O(a + b) time and space.
    a= list a length.
    b= list b length.
     */


    /*
    Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?
     */

    public ListNode getIntersectionNodeTwo(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        // we will need to find the length of each list.
        int lengthA = findListLength(headA);
        int lengthB = findListLength(headB);

        // we want to move the longer list down, until their lengths are the same.
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }

        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }

        // once they are the same, we simply need to move down each list until we find their intersection point.
        // if they are the same because they are both null, we will return null as well.
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        // we can return either head at this point.
        return headA;
    }

    public int findListLength(ListNode node) {
        int length = 0;
        while (node!=null) {
            node= node.next;
            length++;
        }
        return length;
    }

}
