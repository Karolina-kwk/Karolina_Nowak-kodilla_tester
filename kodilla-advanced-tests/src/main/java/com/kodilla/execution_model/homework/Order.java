package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double value;
    private LocalDate date;
    private String person;

    public Order(double value, LocalDate date, String person) {
        this.value = value;
        this.date = date;
        this.person = person;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Order) ) return false;
        Order order = (Order) o;
        return Double.compare(order.getValue(), getValue()) == 0 &&
                Objects.equals(getDate(), order.getDate()) &&
                Objects.equals(getPerson(), order.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getDate(), getPerson());
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", person='" + person + '\'' +
                '}';
    }
}