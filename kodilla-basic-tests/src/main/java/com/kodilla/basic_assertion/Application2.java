package com.kodilla.basic_assertion;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        Calculatorb calculatorb = new Calculatorb();
        int a = 5;
        int b = 8;
        int dodawanie = calculatorb.sum(a, b);
        boolean correct = ResultChecker.assertEquals(15, dodawanie);
        if (correct) {
            System.out.println("Dodawanie działa poprawnie");
        } else {
            System.out.println("Dodawanie nie działa poprawnie");
        }
        int odejmowanie = calculatorb.substract(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3, odejmowanie);
        if (correct1) {
            System.out.println("Odejmowanie działa poprawnie");
        } else {
            System.out.println("Odejmowanie nie działa poprawnie");
        }
        int potegowanie = calculatorb.power(a);
        boolean correct2 = ResultChecker.assertEquals(25,potegowanie);
        if (correct2){
            System.out.println("Potęgowanie działa poprawnie");
        } else {
            System.out.println("Potęgowanie nie działa poprawnie");
        }
    }
}