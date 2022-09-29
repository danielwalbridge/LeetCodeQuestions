package REPEAT;

/*
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.



Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.

 */

public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {

        // set initial sum
        int greatestSum = 0;
        // grab amount of cards to loop pulling from back.
        int firstPullFromBack = k;

        int cardPointIndexes = cardPoints.length-1;

        // grab total sum if we pull all from the back
        for (int backCardIndex = cardPointIndexes; firstPullFromBack >0 ; backCardIndex--) {
            greatestSum+= cardPoints[backCardIndex];
            firstPullFromBack--;
        }
        // grab back index and set it to one before the last card grabbed
        // will help prevent index out of bounds
        int backCardIndex = cardPointIndexes - k -1;

        // set new sum to start = to greatestSum
        int newSumTotal = greatestSum;

        // loop from the front of the deck, and checking if the new sum is greater than previous
        for (int i = 0; i < k; i ++) {
            // move to next back card
            backCardIndex++;

            // remove sum of last pulled card form back
            newSumTotal-= cardPoints[backCardIndex];

            // add card from the front
            newSumTotal+= cardPoints[i];

            // compare the values an update as needed
            greatestSum = Math.max(greatestSum, newSumTotal);
        }

        // return greatest sum
        return greatestSum;
}

// get an out of bounds issue, but I'm close to solving it
    // I'm ladning on somethingknown as Prefix Sum.


}
