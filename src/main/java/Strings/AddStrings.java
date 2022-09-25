package Strings;

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 You must also not convert the inputs to integers directly.



Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

 */

public class AddStrings {
    public String addStrings(String num1, String num2) {

        // do some checks
        if (num1 ==null && num2 == null) {
            return new String("");
        }
        if (num1==null) {
            return num2;
        }
        if (num2==null) {
            return num1;
        }

        // create StringBuilder
        StringBuilder sb = new StringBuilder();
        // grab max index
        int num1index= num1.length() -1;
        int num2index = num2.length() -1;

        int carry = 0; // set initial carry value
        // while both strings still have values
        while (num1index >= 0 && num2index >=0) {
            // grab both values
            int num1Value = Character.getNumericValue(num1.charAt(num1index));
            int num2Value = Character.getNumericValue(num2.charAt(num2index));
            // grab total value
            int totalValueAtIndex = num1Value + num2Value + carry;

            // append to sb
            if (totalValueAtIndex <=9) {
                sb.append(totalValueAtIndex);
                carry =0;
            }
            else {
                sb.append(totalValueAtIndex-10);
                carry=1;
            }
            num1index--;
            num2index--;
        }

        // we could still have values in one or the other strings.

        while (num1index >=0) {
            if (carry >0) {
                int totalValueAtIndex = carry+ Character.getNumericValue(num1.charAt(num1index));
                if (totalValueAtIndex <=9) {
                    sb.append(totalValueAtIndex);
                    carry =0;
                }
                else {
                    sb.append(totalValueAtIndex-10);
                }
            }
            else {
                sb.append(Character.getNumericValue(num1.charAt(num1index)));
            }
            num1index--;
        }

        while (num2index >=0) {
            if (carry >0) {
                int totalValueAtIndex = carry+ Character.getNumericValue(num2.charAt(num2index));
                if (totalValueAtIndex <=9) {
                    sb.append(totalValueAtIndex);
                    carry =0;
                }
                else {
                    sb.append(totalValueAtIndex-10);
                }
            }
            else {
                sb.append(Character.getNumericValue(num2.charAt(num2index)));
            }
            num2index--;
        }

        // need to add carry value if there is one left over.
        if (carry ==1) {
            sb.append(carry);
        }
        // reverse the String and return
        return sb.reverse().toString();
    }
}
