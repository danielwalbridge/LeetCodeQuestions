package Strings;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "([)]";

        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        // for each character in the string we are going to check if
        // it is an opening character.
        // if it is then we need to add the inverse closer.

        // if we find a closer, then we need to make sure that it matches the last closer in the stack.
        // if it does not match we can return false
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
