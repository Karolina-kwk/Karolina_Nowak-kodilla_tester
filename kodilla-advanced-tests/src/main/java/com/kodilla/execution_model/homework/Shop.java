package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> returnOrdersListFromLastMonth() {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(LocalDate.now().minusMonths(1)))
                .collect(Collectors.toList());
    }
    public List<Order> getOrdersFromRange (LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from) && o.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public double toSumAllOrdersPrice() {
        double sum = 0;
        for(Order order : orders) {
            sum += order.getPrice();
        }
        return sum;
    }

    public int getSize() {
        return this.orders.size();
    }
}
