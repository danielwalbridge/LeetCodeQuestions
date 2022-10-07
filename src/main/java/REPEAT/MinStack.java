package REPEAT;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.



Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

-231 <= val <= 231 - 1

Methods pop, top and getMin operations will always be called on non-empty stacks.

At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */

import java.util.Stack;

public class MinStack {

    // we need to create a stack, that has some additional methods to it.
    // will need to hold the current min value.
    // the current min value's place needs to be held for the function getmin.

    int currentMinValue;
    Stack<Integer> stack;


    // creates the new stack object.
    public MinStack() {
        stack = new Stack<>();
    }

    // pushes the element on the stack, but will need to check if it's less than current min
    // will need to hold current min.
    public void push(int val) {
        if (val < currentMinValue) {
            currentMinValue = val;
        }

    }

    // normal pop function
    public void pop() {
        stack.pop();

    }

    // peek function in stack.
    public int top() {
       return stack.peek();
    }

    // needs to grab and remove the min value in the the ds. also needs to update the min value to the new min value.
    // so the min value then needs to somehow point to the next min value.
    public int getMin() {

        return 1;
    }

    // could use 2 stacks... Will need to try again.


}
