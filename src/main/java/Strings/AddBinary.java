package Strings;

/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

public class AddBinary {

    // I don't know binary, so this is tricky to think about,

    public String addBinary(String a, String b) {
        // create SB
        StringBuilder stringBuilder = new StringBuilder();
        // start by grabbing the back index of each string.
        int i = a.length() -1;
        int j = b.length() -1;
        // set carry to 0
        int carry = 0;
        // loop through both strings.

        while (i >=0  || j >=0) {
            // add the carry value
            int sum = carry;
            // add the sums for each string.
            if (i>=0) sum+= a.charAt(i) - '0'; // Checks if not out of bounds and converts char into number
            if (j>=0)sum+= b.charAt(j) - '0';// Checks if not out of bounds and converts char into number
            // append to SB
            stringBuilder.append(sum % 2); // this will give us either a 0 or a 1;
            // set the carry
            carry= sum/2;

            // move to the next place in each string
            i--;
            j--;
        }

        // append carry if a 1.
        if (carry!=0) {
            stringBuilder.append(carry);
        }

        // reverse string to return
        return stringBuilder.reverse().toString();
    }

    // O(max(a, b)) time and space

}
