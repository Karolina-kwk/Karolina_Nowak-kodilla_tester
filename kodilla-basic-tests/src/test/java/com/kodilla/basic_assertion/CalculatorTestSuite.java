package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub(){
        Calculator calculator1 = new Calculator();
        int c = 14;
        int d = 7;
        int subResult = calculator1.substract(c,d);
        assertEquals(7,subResult);
    }

    @Test
    public void testPow() {
        Calculator calculator2 = new Calculator();
        int e = 5;
        int powerResult;
        powerResult = calculator2.power(e);
        assertEquals(25,powerResult);

        powerResult = calculator2.power(-4);
        assertEquals(16,powerResult);

        powerResult = calculator2.power(0);
        assertEquals(0,powerResult);

    }
}

