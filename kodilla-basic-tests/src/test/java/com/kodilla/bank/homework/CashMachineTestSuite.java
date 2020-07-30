package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroTransactions() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        assertEquals(0, cashMachine.getQuantity());
    }

    @Test
    public void shouldHaveTwoTransactions() {
        CashMachine cashMachine = new CashMachine(new double[] {789.31, -17.00});
        assertEquals(2, cashMachine.getQuantity());
    }

    @Test
    public void shouldHaveZeroBalance() {
        CashMachine cashMachine = new CashMachine(new double[] {100, -100});
        assertEquals(0, cashMachine.getAccountStatus());
    }

    @Test
    public void shouldHave200Balance() {
        CashMachine cashMachine = new CashMachine(new double[] {300, -100});
        assertEquals(200, cashMachine.getAccountStatus());
    }

    @Test
    public void shouldHave0PayOutSum() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        assertEquals(0, cashMachine.getPayOutSum());
    }

    @Test
    public void shouldHave0PayInSum() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        assertEquals(0, cashMachine.getPayInSum());
    }

    @Test
    public void shouldHaveMinus10PayOutSum() {
        CashMachine cashMachine = new CashMachine(new double[] {-8, -2, 4, 8});
        assertEquals(-10, cashMachine.getPayOutSum());
    }

    @Test
    public void shouldHavePlus10PayInSum() {
        CashMachine cashMachine = new CashMachine(new double[] {-8, -2, 2, 8});
        assertEquals(10, cashMachine.getPayInSum());
    }
}
