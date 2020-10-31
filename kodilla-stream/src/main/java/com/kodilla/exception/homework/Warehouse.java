package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
        return order;
    }

    public int ordersCount(){
        return this.orders.size();
    }

}
