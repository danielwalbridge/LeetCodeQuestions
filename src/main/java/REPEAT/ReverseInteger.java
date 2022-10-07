package REPEAT;
/*

Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */

import com.sun.jdi.connect.Connector;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverse(-123);
    }

    public int reverse(int x) {
        // check if we have a pos or neg value
        boolean isPositive = x >= 0;

        // convert to string
        String number = String.valueOf(x);

        // remove '-' character if negative.
        if (!isPositive) {
           number = number.substring(1, number.length());
        }

        // add to string builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);

        // try creating the string, if we get an exception, it's out of bounds.
        try {
            int reverseNumber = Integer.parseInt(stringBuilder.reverse().toString());

            if (!isPositive) {
                reverseNumber= -reverseNumber;
            }
            return reverseNumber;
        }
        // if out of bounds return 0
        catch (Exception e) {
            return 0;
        }

    }

    // there is a lot of conversion in this - I know that there is a more math forward way to do it just using ints
    // will need to come back and try and solve in a more optimal way
}
