package com.kodilla.exception.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class WarehouseTestSuite extends TestCase {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("sp/36"));
        //when
        Order orderResult = warehouse.getOrder("sp/36");
        //then
        assertEquals(new Order("sp/36"), orderResult);
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("kn/36"));
        //when
        Order orderResult = warehouse.getOrder("kn/36");
    }

}