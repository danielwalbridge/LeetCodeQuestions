package Strings;

/*
Given a string s and a dictionary of strings wordDict,
 return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false

 */

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        String s = "ccaccc";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cc");
        wordDict.add("ac");


        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreakDP(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for (int i = 1; i <= s.length(); ++i) {
            String first = s.substring(0, i);
            if (wordDict.contains(first)) {
                String remainingWord = s.substring(i);

                if (remainingWord == null || remainingWord.length() == 0 || wordDict.contains(remainingWord) || wordBreak(remainingWord, wordDict)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    O(2^n) time
    0(n^2) space

    to improve the time complexity to O(n^2) we can use DP.

     */


    public boolean wordBreakDP(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) return false;

        int n = s.length();

        // dp[i] represents whether s[0...i] can be formed by dict
        boolean[] dp = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                String sub = s.substring(j, i + 1);

                if (wordDict.contains(sub) && (j == 0 || dp[j - 1])) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n - 1];
    }
}
