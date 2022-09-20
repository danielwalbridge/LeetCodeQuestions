package HashTable;

/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
  The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.


 */

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        //create a hashmap with Roman to integer values mapped.
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // set prv to the last value in the String
        char previousChar = s.charAt(s.length()-1);

        // set total to start at the last value in the string
        int total = map.get(previousChar);

        // want to loop through the
        // array starting from the end.
        // we can start two in from the end, sine we grabbed the end as previous
        for (int i = s.length()-2; i >=0; i--) {
            // grab current character
            char currentChar = s.charAt(i);
            // if the prev value is larger, we know we need to subtract from the total
            if (map.get(previousChar) > map.get(currentChar)) {
                total-= map.get(currentChar);
            }
            // else the current is larger, and we can add it to the total.
            else {
                total+=map.get(currentChar);
            }
            //update previous to current
            previousChar = currentChar;
        }
        return total;
    }

    /*
    o(n) time
    n = length of the string.
    o(1) space. since the map inputs are all constant
     */
}
