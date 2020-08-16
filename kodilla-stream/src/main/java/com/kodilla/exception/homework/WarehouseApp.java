package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("kn/23"));
        warehouse.addOrder(new Order("zn/65"));
        warehouse.addOrder(new Order("hn/60"));
        warehouse.addOrder(new Order("jp/35"));

        try {
            warehouse.getOrder("zp/2");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, your order number does not exist in our system. Please contact Customer Support.");
        } finally {
            System.out.println("Thank you for choosing our shop!");
        }
    }
}
