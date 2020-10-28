package com.kodilla.jacoco;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisableBy400(){
        // given
        Year year = new Year(1600);
        // when
        boolean isLeapYear = year.isLeap();
        // then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisableBy100(){
        // given
        Year year = new Year(1800);
        // when
        boolean isLeapYear = year.isLeap();
        // then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisableBy4ButNot100(){
        // given
        Year year = new Year(1804);
        // when
        boolean isLeapYear = year.isLeap();
        // then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfNotDivisableBy100(){
        // given
        Year year = new Year(1805);
        // when
        boolean isLeapYear = year.isLeap();
        // then
        assertFalse(isLeapYear);
    }
}