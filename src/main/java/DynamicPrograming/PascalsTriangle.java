package DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

       1
      1 1
    1  2  1
  1   3  3  1
 1  4   6  4  1

    Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultsList = new ArrayList<>();

        if (numRows == 0) {
            return resultsList;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        resultsList.add(firstRow);

        for (int i =1 ; i<numRows; i++) {
            // Grab previous row;
            List<Integer> previousRow = resultsList.get(i-1);
            // create another list for current row
            List<Integer> currentRow = new ArrayList<>();
            // each first element in pascals triangle is 1, so just add that
            currentRow.add(1);

          /*
          The inner loop is going to build each row.
          we can start at 1, since index 0 is always going to be 1;
          we loop up to i, since i will tell us the size of the current list we need to make.
           */
            for (int j =1; j<i; j++) {
                // add the row at j and its previous value to get the current value.
                currentRow.add(previousRow.get(j-1) + previousRow.get(j));
            }
            // last element in each list will be 1, so add it
            currentRow.add(1);
            // add current row list to result list
            resultsList.add(currentRow);
        }
        return resultsList;
    }

    /*
    O(n^2) space and time
     */
}
