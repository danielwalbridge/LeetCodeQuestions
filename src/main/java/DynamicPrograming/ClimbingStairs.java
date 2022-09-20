package DynamicPrograming;

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

public class ClimbingStairs {

    public int climbStairs(int n) {
        //create a dp array
        int[] dp = new int[n+1];

        // there is one way to get to zero steps
        // there is one way to get to 1 step.
        dp[0] = 1;
        dp[1] = 1;

        // loop through to find how to get to each step.
        for( int i = 2; i <= n ; i++) {
           /*
           we can get to the current step if we are 1 step away or 2 steps away
           thus to find out how many ways to get to the current step, we can find the ways to get to step -1 and step -2,
           then add them together.
            */
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}

/*
O(n) space and time
n = number passed in / size of new dp array
 */
