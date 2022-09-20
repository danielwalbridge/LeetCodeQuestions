package DynamicPrograming;
/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

       1
      1 1
    1  2  1
  1   3  3  1
 1  4   6  4  1



Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> rowZero = new ArrayList<>();
        rowZero.add(1);

        triangle.add(rowZero);

        // loop up until and include the row index
        for (int i = 1; i <= rowIndex; i++) {
            // create new row
            List<Integer> currentRow = new ArrayList<>();
            // each row starts with 1;
            currentRow.add(1);
            // grab previousRow to help build
            List<Integer> previousRow = triangle.get(i - 1);

            //build the current row.
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            // add last index, which is always 1
            currentRow.add(1);
            // add current row list into triangle
            triangle.add(currentRow);
        }
        return triangle.get(rowIndex);
    }

    /*
    Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
     */

    public List<Integer> getRowLinearSpace(int rowIndex) {

        // create prev list and add index o(1)
        List<Integer> previous = new ArrayList<>();
        previous.add(1);

        for (int i = 1; i<=rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j <i; j++) {
                currentRow.add(previous.get(j) + previous.get(j-1));
            }
            currentRow.add(1);
            previous = currentRow;
        }
        return previous;
    }
}

/*
both will have a run time of o(n^2)
- n = input value;
however the bottom method will have a space of o(n) compared to o(n^2) from the top method.
 */

