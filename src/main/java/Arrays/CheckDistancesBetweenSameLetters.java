package Arrays;
//
//You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.
//
//        Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).
//
//        In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.
//
//        Return true if s is a well-spaced string, otherwise return false.
//


import java.util.HashMap;

public class CheckDistancesBetweenSameLetters {

    public static boolean checkDistances(String s, int[] distance) {



        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int firstIndex = map.get(s.charAt(i));
                int index=s.charAt(i)-'a';
                int spaceBetweenIndex = i - firstIndex - 1;
               if (distance[index]!= spaceBetweenIndex) return false;
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return true;
    }
}

/*
Big O

O(c) time: c = number of characters in String.
O(c) space: c = number of characters in String ( placed into the map)
-- However --
if you are only looking at the lower case letters, and there is only every 2 pairs of any letter, the largest s could be is 52 chars.
 */

/*
Had to learn the below to complete this problem, as it was my hang up point.

The statement ++array[s.charAt(i) - 'A']; is incrementing the value in the array indexed by s.charAt(i) - 'A'.

The reason for - 'A', is that it "shifts" the ascii/unicode value so that A - Z have values 0 - 25. And are thus more suitable as an array index.
 */
