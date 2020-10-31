package com.kodilla.exception.homework;

import org.junit.Test;
import static org.junit.Assert.*;


public class WarehouseTestSuite {


    @Test
    public void testAddOrder_returnsCorrectOrdersCount(){
        // given
        Warehouse warehouse = new Warehouse();
        // when
        warehouse.addOrder(new Order("123456"));
        // then
        assertEquals(1, warehouse.ordersCount());
    }

    @Test
    public void testAddOrder_returnsCorrectOrderObject() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        warehouse.addOrder(new Order("123456"));
        Order actualOrder = warehouse.getOrder("123456");
        // then
        Order expectedOrder = new Order("123456");
        assertEquals(expectedOrder, actualOrder );
    }



    @Test(expected = OrderDoesntExistException.class)
    public void testFindOrder_throwsException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        warehouse.addOrder(new Order("123456"));
        // then
        Order actualOrder = warehouse.getOrder("123456xx");
    }

}