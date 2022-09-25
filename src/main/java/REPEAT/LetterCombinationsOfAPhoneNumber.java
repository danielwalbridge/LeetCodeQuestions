package REPEAT;

import java.util.HashMap;
import java.util.List;


/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

1
2 abc
3 def
4 ghi
5 jkl
6 mno
7 pqrs
8 tuv
9 wxyz


Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 */

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {


// 09-25-2022
// I have the idea of how to approch it, I'm just unsure on the execution.
// this is as far as I got with some code

        // generate the map
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        // generate a letters array
        String[] lettersFromDigits = new String[digits.length()-1];
        // index for each.
        int index =0;
        // grab all the letters to compare.
        for (Character number:digits.toCharArray()) {
            lettersFromDigits[index] = map.get(number);
            index++;
        }

        // Sticking point.. we need to then compare index of 0 in first array with all possible combinations of the other letters...

        // grab first digit string.
        String firstDigitsLetter = lettersFromDigits[0];

        // loop through the array...but how do we generate all the loops we will need?
        for (int i =0; i < firstDigitsLetter.length(); i++) {

        }
    }
}
