package REPEAT;

/*
Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.



Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"
Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"
Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"

 */

public class DaysOfTheWeek {

    /*
    this was a solution I found online.
    I will have to re try this one and see if I can get it next time.
    Placing in Repeat
     */

//    public String dayOfTheWeek(int day, int month, int year) {
//        // create an array to hold the days.
//        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        // create an array to hold the days of each month
//        int[] days = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        // hold a count of days.
//        int count = 0;
//        // loop through the years adding the days to the count, until we get to the year in question.
//        for(int i = 1971;i<year;i++) {
//            count += i % 4 == 0 ? 366 : 365;
//        }
//        // loop through the month until we get to the month in question, adding the amount of days
//        for(int i=0;i<month-1;i++) {
//            count += days[i];
//        }
//        // add the days into the week its at.
//        count += day;
//        // add four to the count since the first day was a friday.
//        return week[(count + 4) % 7];
//    }
//
//    private boolean isLeapYear(int year) {
//        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//    }
}

