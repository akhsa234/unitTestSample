package com.bahar.unittestsample;

public class LeapYear {

//    public static boolean isLeapYear(final int year){
//      //  return false; // version 1
//       // return true; //version 2
//
//       return year % 4==0 && !(year % 100 ==0); //version 3
//    }

    public static boolean isLeapYear(final int year){
        //return isDivisible(year ,4) && !(year % 100 ==0 ); // version 4
        return isDivisible(year ,4)
                && !isDivisible(year ,100)
                || isDivisible(year ,400);
    }

    private static boolean isDivisible( final int year, final int denominator) {
        return year % denominator == 0;

    }
}
