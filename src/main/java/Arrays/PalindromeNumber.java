package Arrays;


import java.util.Arrays;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        if (number.length() <2) {
            return true;
        }
        char[] numberArray = number.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = numberArray.length-1; i >=0; i--) {
            stringBuffer.append(numberArray[i]);
        }
        return number.equals(stringBuffer.toString());

    }
}

/*
O(n) time : n= digits in x
O(s) space : S = digits in x
 */
