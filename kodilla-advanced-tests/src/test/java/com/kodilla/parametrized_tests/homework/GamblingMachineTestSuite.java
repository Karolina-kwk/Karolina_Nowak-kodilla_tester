package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource.csv")
    public void shouldThrowExceptionWhenProvidedNumbersQuantityIsDifferentThanSix(int one, int two, int three, int four, int five) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five));
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource1.csv")
    public void shouldThrowExceptionWhenProvidedNumbersQuantityIsDifferentThanSixV2(int one, int two, int three, int four, int five, int six, int seven) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five, six, seven));
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource2.csv")
    public void shouldThrowExceptionWhenProvidedNumberIsZero(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five, six));
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource3.csv")
    public void shouldThrowExceptionWhenProvidedNumberIsNegative(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five));
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource4.csv")
    public void shouldThrowExceptionWhenProvidedNumberIsDuplicate(int one, int two, int three, int four, int five) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five));
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSource5.csv")
    public void shouldCountHowManyWinsWhenSixNumbersProvided(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(one, two, three, four, five, six));
        int result = gamblingMachine.howManyWins(numbers);
        assertTrue(result >= 0 && result <= 6);
    }

}