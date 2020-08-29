package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {

    @Test
    public void shouldAdded() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.add(4,4);
        Assertions.assertEquals(8, testValue, 0.01);
    }

    @Test
    public void shouldSubtracted() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.subtract(5,15);
        Assertions.assertEquals(-10, testValue, 0.01);
    }

    @Test
    public void shouldMultiplied() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.multiply(2,5);
        Assertions.assertEquals(10, testValue, 0.01);
    }

    @Test
    public void shouldDivided() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double testValue = bean.divide(100,50);
        Assertions.assertEquals(2.0, testValue, 0.01);
    }

}