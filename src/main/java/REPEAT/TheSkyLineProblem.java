package REPEAT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/*
A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance.
 Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:

lefti is the x coordinate of the left edge of the ith building.
righti is the x coordinate of the right edge of the ith building.
heighti is the height of the ith building.
You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.

The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...].
 Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list,
  which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends.
  Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

Note: There must be no consecutive horizontal lines of equal height in the output skyline.
 For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable;
  the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]



Example 1:


Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
Explanation:
Figure A shows the buildings of the input.
Figure B shows the skyline formed by those buildings. The red points in figure B represent the key points in the output list.
Example 2:

Input: buildings = [[0,2,3],[2,5,3]]
Output: [[0,3],[5,0]]

 */

public class TheSkyLineProblem {

    public List<List<Integer>> getSkyline(int[][] buildings) {

        // create a map to hold skylines
        HashMap<Integer, Integer> skylineMap = new HashMap<>();

        // loop through all the buildings
        for( int i =0; i < buildings.length; i ++) {

            //grab the values of each building at i
            int leftOfBuilding = buildings[i][0];
            int rightOfBuilding = buildings[i][1];
            int heightOfBuilding = buildings[i][2];

            // check for each x coord that building occupies
            for (int j = leftOfBuilding; j <=rightOfBuilding; j++) {

                // check if value is in map.
                if (skylineMap.containsKey(j)) {

                    // check if new height is greater than mapped height
                    if (heightOfBuilding > skylineMap.get(j)) {
                        // update to new height
                        skylineMap.replace(j, heightOfBuilding);
                    }
                    // else it's not in map, so we place it in the map.
                } else {
                    skylineMap.put(j, heightOfBuilding);
                }
            }
        }
        // grab an array of all the keys.
        Set<Integer> keySet = skylineMap.keySet();
        // sort the keys
        Stream<Integer> sortedKeys = keySet.stream().sorted();

        // as far as I got with 45 mins.
        // most of the time was spent thinking and drwing this out on paper

        //todo try and complete porblem next time

        return new ArrayList<>();
    }
}
