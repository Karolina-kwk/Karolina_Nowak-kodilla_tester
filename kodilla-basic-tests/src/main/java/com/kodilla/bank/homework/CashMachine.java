package com.kodilla.bank.homework;

public class CashMachine {
    double[] transactions;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public double getAccountStatus() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getQuantity() {
        return transactions.length;
    }

    public int getPayOutQuantity() {
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public double getPayInQuantity() {
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public double getPayOutSum() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public double getPayInSum() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }
}
