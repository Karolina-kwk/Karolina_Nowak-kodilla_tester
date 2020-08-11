package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> listDepartures = new ArrayList<>();
        for (Flight flightFrom : FlightRepository.getFlightsTable()) {
            if (flightFrom.getDeparture().equals(departure)) {
                listDepartures.add(flightFrom);
            }
        }
        return listDepartures;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> listArrivals = new ArrayList<>();
        for (Flight flightTo : FlightRepository.getFlightsTable()) {
            if (flightTo.getArrival().equals(arrival)) {
                listArrivals.add(flightTo);
            }
        }
        return listArrivals;
    }
}
