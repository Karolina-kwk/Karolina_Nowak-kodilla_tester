package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTestSuite {

    @Test
    public void packageShouldBeNotDeliveredIfHerWeightIsAbove30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Baborowska 40, Warszawa", 30.05);
        Assertions.assertEquals("Package not delivered to: Baborowska 40, Warszawa", testResult);
    }


    @Test
    public void packageShouldBeDeliveredIfHerWeightIsUnder30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Baborowska 40, Warszawa", 28.99);
        Assertions.assertEquals("Package delivered to: Baborowska 40, Warszawa", testResult);
    }

    @Test
    public void parametersShouldBeNotNull() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Baborowska 40, Warszawa", 28.99);
        Assertions.assertNotNull(testResult);
    }

    @Test
    public void providedAddressIsNotTheSame() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testResult = bean.sendPackage("Warszawa", 50.01);
        Assertions.assertNotEquals("Baborowska 40, Warszawa", testResult);
    }

}