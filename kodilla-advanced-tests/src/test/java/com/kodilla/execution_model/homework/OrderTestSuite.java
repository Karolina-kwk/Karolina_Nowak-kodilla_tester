package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();

    @BeforeEach
    public void dataTransfer() {
        shop.addOrder(new Order(126.56, LocalDate.of(2020, 6, 5), "Anka93"));
        shop.addOrder(new Order(349.00, LocalDate.of(2020, 5, 8), "Anka83"));
        shop.addOrder(new Order(112.16, LocalDate.of(2020, 5, 15), "Anka73"));
        shop.addOrder(new Order(196.57, LocalDate.of(2020, 3, 25), "Anka63"));
    }

    @Test
    public void shouldAddAllProvidedOrders() {
        assertEquals(4, shop.getSize());
    }

    @Test
    public void shouldReturnOrdersListFromLastTwoMonths() {
        List<Order> testResult = shop.returnOrdersListFromLastTwoMonths();
        assertEquals(0, testResult.size());
    }

    @Test
    public void shouldGetOrderFromConcreteRangeofValues() {
        List<Order> testResult = shop.getOrderFromConcreteRangeofValues(100.00, 200.00);
        assertEquals(3, testResult.size());
    }

    @Test
    public void shouldSumAllOrdersValues() {
        double testResult = shop.toSumAllOrdersValues();
        assertEquals(784.29, testResult, 0.01);
    }

    @Test
    public void shouldGetOrdersFromMay() {
        List<Order> testResult = shop.getOrdersFromRange(LocalDate.of(2020, 5, 1), LocalDate.of(2020, 5, 31));
        assertEquals(2, testResult.size());
    }

    @Test
    public void shouldgetOrdersFromEmptyRange() {
        List<Order> testResult = shop.getOrdersFromRange(LocalDate.of(2019, 5, 1), LocalDate.of(2019, 5, 31));
        assertEquals(0, testResult.size());
    }

}