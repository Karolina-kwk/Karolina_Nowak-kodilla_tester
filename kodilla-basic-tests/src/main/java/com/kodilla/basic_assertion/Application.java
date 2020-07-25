package com.kodilla.basic_assertion;


import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb "+ a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb "+ a + " i "+b);
        }
        Calculator calculator1 = new Calculator();
        int c = 14;
        int d = 7;
        int subResult = calculator1.substract(c,d);
        boolean right = ResultChecker.assertEquals(7,subResult);
        if (right) {
            System.out.println("Metoda substract działa poprawnie dla liczb "+ c + " i " + d);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb "+ c + " i "+ d);
        }
        Calculator calculator2 = new Calculator();
        int e = 5;
        int powResult = calculator2.power(e);
        boolean ok = ResultChecker.assertEquals(25,powResult);
        if (ok) {
            System.out.println("Metoda power działa poprawnie dla liczby "+ e + " podniesionej do kwadratu");
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby "+ e + " podniesionej do kwadratu ");
        }
    }
}
