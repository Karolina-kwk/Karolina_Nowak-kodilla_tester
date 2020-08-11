package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFrom = new FlightFinder();
        //when
        List<Flight> fromTest = flightFrom.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Paris"));
        assertEquals(expectedList, fromTest);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightTo = new FlightFinder();
        //when
        List<Flight> toTest = flightTo.findFlightsTo("Zakynthos");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Gdansk", "Zakynthos"));
        assertEquals(expectedList, toTest);

    }

}