package DynamicPrograming;

/*
You are given an integer array coins representing coins of different denominations
and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount.
If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.



Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 */

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int targetAmount) {

        // create the DP array with targetAmount +1;
        // need to make sure we have the plus one, since this is zero based
        int[] dp = new int[targetAmount + 1];

        // we want to fill the whole array with something that would invalid. since we don't know yet.
        Arrays.fill(dp, targetAmount+1);

        // bottom up approach.
        // what is the fewest amount of coins we need to make 0 cents,
        // 0.
        dp[0] = 0;

        // now we want to fill our array with the smallest amount of coins all the way up to the target.
        for (int i =1; i<=targetAmount;i++) {
            // need to now itt through all coins
            for (int j =0; j<coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
                }
            }
        }
        return dp[targetAmount] > targetAmount ? -1 : dp[targetAmount];
    }
}

/*

O(n * m) runtime
O(m) space
n = elements in coins
m = target amount

 */
