package REPEAT;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
    }
    public boolean isPalindrome(String s) {

        // check if the string is blank and return true if it is
        if (s.isBlank()) {
            return true;
        }

        // grab two pointers.
        int frontPointer = 0;
        int backPointer = s.length()-1;

        // convert to lowercase;
        s = s.toLowerCase();

        // move forward and backward through the string.
        // if we find an exception return false.
        while (frontPointer <= backPointer) {
            // move frontPointer until it is a letter or digit
            while (!Character.isLetterOrDigit(s.charAt(frontPointer)) && frontPointer <=backPointer) {
                frontPointer++;
            }
            // move backPointer until it points at a letter of digit
            while (!Character.isLetterOrDigit(s.charAt(backPointer))  && frontPointer <=backPointer) {
                backPointer--;
            }

            if (s.charAt(frontPointer)!= s.charAt(backPointer)) {
                return false;
            }
            frontPointer++;
            backPointer--;
        }
        // did not return false the whole time, so it's true
        return true;
    }

    // almost have it, just dealing with some bounds issues and optimization.



}
