package Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

public class SortColors {

    // can do it suboptimal with a nested for loop and n^2

    public void sortColors(int[] colors) {
        if (colors.length ==0 || colors.length==1) return;

        // we need to keep track of the start and end index, along with the current

        int start = 0;
        int end  = colors.length-1;
        int currentIndex = 0;

        // want to loop through while start is less than end
        // AND while current index is not greater than end
        while (currentIndex <=end && start < end) {
            // if we find a 0
            if (colors[currentIndex] ==0) {
                colors[currentIndex] = colors[start];
                colors[start] = 0;
                start++;
                currentIndex++;
                // if we find a 2
            } else if (colors[currentIndex] == 2) {
                colors[currentIndex] = colors[end];
                colors[end] = 2;
                end--;
                // else we find a 1
            } else {
                currentIndex++;
            }
        }
    }
    // O(1) space
    // O(n) time
}
