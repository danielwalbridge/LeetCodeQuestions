package Arrays;

/*
Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.



Example 1:

Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
Example 2:

Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.
Example 3:

Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.
 */

import java.util.HashMap;

public class MostFrequentEvenElement {

    public static void main(String[] args) {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int[] nums = new int[]{0,0,0,0};
        System.out.println(mostFrequentEvenElement.mostFrequentEven(nums));

    }

    // Need to loop through the array.
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //loop through the array, checking each valeue
        for (Integer integer: nums) {
            // Check if even.
            if (integer %2 ==0) {
                // Check if not in map.
                // put in map and set count to 1
                if (!map.containsKey(integer)) {
                    int count = 1;
                    map.put(integer, count);
                } else {
                   // else it is in the map, and we need to update the count.
                   int count= map.get(integer);
                   map.replace(integer, count+1);
                }

            }
        }
        int key =-1;
        int count =-1;
        // for each key in the map.
        for (Integer currentKey: map.keySet()) {
            // grab its count value;
            int currentCount = map.get(currentKey);
            // if its count is greater than current count, update.
            if (currentCount > count) {
                key = currentKey;
                count = currentCount;
            }
            // if count and current count are the same, and the current key is smaller than
            // key, update key
            else if (currentCount == count && currentKey < key) {
                key = currentKey;
            }
        }
        return key;
    }
}


/*
- We could also approach this problem by sorting the array. then looping though the array and counting the occur,
- for each int. would then only update if the count is greater.
-- it would take a longer time, since we would need to sort the array, however, we would be using less memory

- for the above approach, I used a HashMap.
O(n + m) time. n = size of input array and m the size of the map.
O(m) space
 */
