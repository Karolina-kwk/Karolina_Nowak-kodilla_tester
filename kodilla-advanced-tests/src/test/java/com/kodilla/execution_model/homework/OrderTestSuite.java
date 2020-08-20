package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {
    Shop shop = new Shop();

    @BeforeEach
    public void dataTransfer() {
        shop.addOrder(new Order(223.4, LocalDate.of(2020, 7, 5), "Tarka123"));
        shop.addOrder(new Order(150.5, LocalDate.of(2020, 5, 8), "Tama2"));
        shop.addOrder(new Order(208.43, LocalDate.of(2020, 6, 15), "Tara54"));
        shop.addOrder(new Order(302.21, LocalDate.of(2020, 7, 25), "Lulu92"));
    }

    @Test
    public void shouldAddAllProvidedOrders() {
        assertEquals(4, shop.getSize());
    }

    @Test
    public void shouldReturnOrdersListFromLastMonth() {
        List<Order> testResult = shop.returnOrdersListFromLastMonth();
        assertEquals(1, testResult.size());
    }

    @Test
    public void shouldSumAllOrdersPrice() {
        double testResult = shop.toSumAllOrdersPrice();
        assertEquals(884.54, testResult, 0.01);
    }

    @Test
    public void shouldGetOrdersFromJuly() {
        List<Order> testResult = shop.getOrdersFromRange(LocalDate.of(2020, 7, 1), LocalDate.of(2020, 7, 31));
        assertEquals(2, testResult.size());
    }

    @Test
    public void shouldGetOrdersFromEmptyRange() {
        List<Order> testResult = shop.getOrdersFromRange(LocalDate.of(2019, 5, 1), LocalDate.of(2019, 5, 31));
        assertEquals(0, testResult.size());
    }

}
