package REPEAT;

/*
Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.



Example 1:

Input: s = "aab"
Output: "aba"
Example 2:

Input: s = "aaab"
Output: ""


Constraints:

1 <= s.length <= 500
s consists of lowercase English letters.
 */

import java.util.Arrays;

public class ReorganizeString {

    public String reorganizeString(String s) {

        if (s.length() <=1) return s;

        char[] chars = s.toCharArray();

        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            j= i+1;
            int firstJIndex =j;
            if (j < chars.length) {
                int firstJIndexChar =chars[j];
                while (j < chars.length && chars[i] == chars[j] ) {
                    j++;
                }
                chars[firstJIndex] = chars[j];
                chars[j] = chars[firstJIndexChar];
            }
        }

        if (chars[chars.length-1] == chars[chars.length-2]) {
            return "";
        }
        return Arrays.toString(chars);
    }
    // first attempt and rusty after not doing kota for a bit
}
