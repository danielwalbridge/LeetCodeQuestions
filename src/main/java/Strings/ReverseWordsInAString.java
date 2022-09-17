package Strings;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        // we need to grab each word in the s, and turn it into a string array.
        // we will want to make sure we are removing all excess space, so we need to use "\\s+"
        String[] strings = s.split("\\s+");
        // create a string builder to create the new sting.
        StringBuilder stringBuilder = new StringBuilder();
        // loop through the string array in reverse order.
        // append the new string and a space between the words
        for (int i = strings.length-1; i >=0; i--) {
            stringBuilder.append(strings[i]);
            stringBuilder.append(" ");
        }
        // grab the string value and trim the last appended space
        return stringBuilder.toString().trim();
    }
}

/*
O(n) time
o(n) space
n = the number of words in the string.
 */
