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

    public static void main(String[] args) {
        MaximumSwap maximumSwap = new MaximumSwap();
        maximumSwap.maximumSwap(9973);
    }

    public int maximumSwap(int num) {

        // convert the int nums into an int[]
        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();

        if (digits.length < 1) {
            return num;
        }

        int frontPointer = 0;
        int backPointer = digits.length-1;

           while (frontPointer < backPointer && digits[frontPointer]== 9) {
               frontPointer++;
           }

        int maxDigetPointer = 0;
        int maxDiget = Integer.MIN_VALUE;

        for (int i = frontPointer; i < digits.length; i ++) {
            while (frontPointer < backPointer) {

                // if we ever find a 9, we can swap it, then break out of the loop.
                if (digits[backPointer] ==9) {
                    digits[backPointer] = digits[frontPointer];
                    digits[frontPointer] = 9;
                    break;
                }
                else {
                    // if we find something larger that is not a 9, we want to hold it's location and move forward.
                    if (digits[backPointer] > maxDiget) {
                        maxDiget = digits[backPointer];
                        maxDigetPointer = backPointer;
                    }
                }
                backPointer--;
            }
            // swap if ever touched anything
            if (digits[maxDigetPointer] != 0 && digits[maxDigetPointer] > digits[frontPointer]) {
                digits[maxDigetPointer] = digits[frontPointer];
                digits[frontPointer] = maxDiget;
                break;
            }
        }
        StringBuilder sb  = new StringBuilder();

        for (int digit: digits) {
            sb.append(digit);
        }

        int finalMax = Integer.parseInt(sb.toString());

        return finalMax;
    }


    // another try, and getting a lot closer, just need to finish it out


}
