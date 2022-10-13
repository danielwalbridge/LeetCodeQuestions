package REPEAT;

/*
Given two non-negative integers num1 and num2 represented as strings,
 return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088
 */

public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        // most simple way I can think of doing it, but it does not allow conversion directly.
//        int int1 = Integer.getInteger(num1);
//        int int2 = Integer.getInteger(num1);
//        int int3 = int1 * int2;
//        return String.valueOf(int3);

        // loop through num2, starting at the smallest place value
        for (int i = num2.length()-1; i >= 0; i--) {
            int lineSum = 0;
            int zeroPlaceHolder = 0;
            int carry = 0;
            // loop through each number in num2, and multiply it by num at i
            for (int j = num1.length()-1; j >= 0; j--) {
                // get the current number by multiplying and adding carry
                int currentSum = num2.indexOf(i) * num1.indexOf(j) + carry;
                if (currentSum >=10) {
                    carry = currentSum%2;
                }
            }
        }
        return "2";
    }

    // I am a bit rusty on cross multiplication, so it took me a min to remember that.
    // I have the idea in mind, I just need to figure out how to translate it into code
}
