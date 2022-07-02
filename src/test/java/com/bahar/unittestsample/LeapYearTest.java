package com.bahar.unittestsample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
/*
a year should  be called leap years is divided by 4  & 400,
but, by 100 are not divisible.
 */
    @Test
    public void leapYearsAreVisibleByFour(){
        assertTrue(LeapYear.isLeapYear(2016)); //

    }

    @Test
    public void normalYearAreNotDivisibleByFour(){
        assertFalse(LeapYear.isLeapYear(3));
    }

    @Test
    public void leapYearsAreNotVisibleByOneHundred(){
        assertFalse(LeapYear.isLeapYear(1900));

    }

    @Test
    public void leapYearsAreNotVisibleByFourHundred(){
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
