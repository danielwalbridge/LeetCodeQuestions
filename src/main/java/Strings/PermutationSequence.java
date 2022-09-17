package Strings;

/*
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.



Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"

 */

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public static void main(String[] args) {
        PermutationSequence permutationSequence = new PermutationSequence();
        permutationSequence.getPermutation(3,3);
    }

    public String getPermutation(int n, int k) {
        int pos =0;
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n+1];
        StringBuilder sb = new StringBuilder();

        // create the array of factorials.
        int sum = 1;
        factorial[0] =1;
        for (int i =1; i<=n;i++) {
            sum*=i;
            factorial[i]=sum;
        }

        // create a list of numbers for index ref
        for (int i =1; i<=n; i++) {
            numbers.add(i);
        }
        // dealing with indexes, so remove 1 from k;
        k--;

        for (int i =1; i<=n; i++) {
            int index = k/factorial[n-1];
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k-=index*factorial[n-i];
        }
        return String.valueOf(sb);
    }

}
