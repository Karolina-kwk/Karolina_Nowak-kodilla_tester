package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> returnOrdersListFromLastTwoMonths() {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(LocalDate.now().minusMonths(2)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderFromConcreteRangeofValues(double minValue, double maxValue) {
        return orders.stream()
                .filter(o -> o.getValue() >= minValue && o.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public double toSumAllOrdersValues() {
        double sum = 0;
        for(Order order : orders) {
            sum += order.getValue();
        }
        return sum;
    }

    public int getSize() {
        return orders.size();
    }

    public List<Order> getOrdersFromRange (LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from) && o.getDate().isBefore(to))
                .collect(Collectors.toList());
    }
}