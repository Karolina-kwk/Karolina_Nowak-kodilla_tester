package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    static Stream<Arguments> provideKilogramsDataForBMICalculation() {
        return Stream.of(
                Arguments.of(new Person(1.70, 40.0), "Very severely underweight"),
                Arguments.of(new Person(1.50, 100.0), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.60, 55.0), "Normal (healthy weight)")
        );
    }
}
