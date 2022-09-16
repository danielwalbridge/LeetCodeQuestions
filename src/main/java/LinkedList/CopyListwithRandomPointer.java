package LinkedList;

/*
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.



Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
 */

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val=val;
            this.next = null;
            this.random=null;
        }
    }

    public Node copyRandomList(Node head) {
        //base case
        if(head == null) return null;
        //define table
        Map<Node, Node> map = new HashMap<>();

        //define cur pointer = head
        Node cur = head;
        map.put(cur, new Node(cur.val));

        //while cur pointer != null
        while(cur != null){
            //1. get the new node of the cur pointer
            Node curClone = map.get(cur);

            //2. Build the random pointer if doesn't exists in the table
            if(cur.random != null && !map.containsKey(cur.random)){
                map.put(cur.random, new Node(cur.random.val));
            }
            Node randomClone = map.get(cur.random);

            //3  get new cur node point to new random node
            curClone.random = randomClone;

            //4. Build the next node if doesn't exists in the table
            if(cur.next != null && !map.containsKey(cur.next)){
                map.put(cur.next, new Node(cur.next.val));
            }
            Node nexClone = map.get(cur.next);
            //5. Get the new curNode point to the next new node
            curClone.next = nexClone;

            //6. cur pointer move the next node
            cur = cur.next;
        }


        //return the new head node from the table
        return map.get(head);
    }

    /*
    Big O
    O(n) time :
    O(n) space:
    n = # of nodes.
     */



}
