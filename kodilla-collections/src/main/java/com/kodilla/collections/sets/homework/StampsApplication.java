package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Lotnik", 5.1, 4.6, true));
        stamps.add(new Stamp("Słonecznik", 4.4, 6.2, true));
        stamps.add(new Stamp("Stocznia", 5.5, 5.5, false));
        stamps.add(new Stamp("Skansen", 4.8, 3.9, true));
        stamps.add(new Stamp("Kot", 3.6, 4.1, false));
        stamps.add(new Stamp("Słonecznik", 4.4, 6.2, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }

}
