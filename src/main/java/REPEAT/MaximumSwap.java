package REPEAT;

/*
You are given an integer num.
You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.



Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.


Constraints:

0 <= num <= 108
 */

import java.util.ArrayList;

public class MaximumSwap {

    public int maximumSwap(int num) {

        String numString = String.valueOf(num);

        if (numString.length() == 1) {
            return num;
        }

        // else we need to loop through the number and swap if needed.

        int frontPointer = 0;
        int backPointer = numString.length()-1;

           while (frontPointer < backPointer && numString.charAt(frontPointer) == '9') {
               frontPointer++;
           }
           // front pointer is no longer 9, so we can check to see if we can swap it with something greater.

        int maxDiget = Integer.MIN_VALUE;
           int maxDigetPointer;
        while (frontPointer < backPointer) {

            if (numString.charAt(backPointer) == '9') {
                // swap the poniters and return new max
            }

//            if (numString.);


       }
        return num;
    }

    // had a hard time focusing on this, but on the right track.
    // Will do it again tomorrow

}
