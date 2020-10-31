package com.kodilla.exception.homework;

import java.sql.SQLOutput;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Order order1 = new Order("A123451");
        Order order2 = new Order("A123452");
        Order order3 = new Order("A123453");
        Order order4 = new Order("A123454");

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        String findOrderNumber = "A123451";
        try {
            Order requiredOrder = warehouse.getOrder(findOrderNumber);
            System.out.println("Order "+ findOrderNumber +" exists");
        } catch (OrderDoesntExistException e){
            System.out.println("Sorry but order" + findOrderNumber +  "does not exists.");
        }

        findOrderNumber ="A123451XY";
        try {
            Order requiredOrder = warehouse.getOrder(findOrderNumber);
            System.out.println("Order "+ findOrderNumber +" exists");
        } catch (OrderDoesntExistException e){
            System.out.println("Sorry but order " + findOrderNumber +  " does not exists.");
        }

    }
}