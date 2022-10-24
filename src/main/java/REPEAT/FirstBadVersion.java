package REPEAT;


/*
You are a product manager and currently leading a team to develop a new product.
 Unfortunately, the latest version of your product fails the quality check.
  Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.



Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1



 */

// There is not way for me to access the VersionControl class thats in the leetcode problem.
// so this will be commented out, to avoid erros in runtime.

//public class FirstBadVersion extends VersionControl {
//    public int firstBadVersion(int n) {
//
//        // set the left and right.
//        int left = 0;
//        int right = n;
//
//
//        // loop while left is less than right to firs the first bad version.
//        // binary search to minimize the api calls.
//        while (left< right) {
//
//            // calculate the mid point
//            int midPoint = left + (right- left) /2 ;
//
//            // of the midpoint is bad, then we need to go left
//            if (isBadVersion(midPoint)) {
//                right = midPoint;
//            }
//            // else midpoint is not bad, and we go right.
//            else {
//                left = midPoint;
//            }
//            if (left==right && isBadVersion(midPoint)) {
//                return left;
//            }
//        }
//
//        return -1;
//    }
//
//}
