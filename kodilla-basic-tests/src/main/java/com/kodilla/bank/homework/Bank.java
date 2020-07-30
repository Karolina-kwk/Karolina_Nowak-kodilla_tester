package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] bankCashMachines;

    public Bank(CashMachine[] bankCashMachines){
        this.bankCashMachines = bankCashMachines;
    }

    public double getBalanceBank(){
        double sum = 0;
        for (int i = 0; i<this.bankCashMachines.length; i++){
            sum += this.bankCashMachines[i].getQuantity();
        }
        return sum;
    }

    public int getPayInQuantity(){
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            quantity += this.bankCashMachines[i].getQuantity();
        }
        return quantity;
    }
    public int getPayOutQuantity(){
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            quantity += this.bankCashMachines[i].getQuantity();
        }
        return quantity;
    }
    public double getPayOutAverage() {
        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            quantity += this.bankCashMachines[i].getPayOutQuantity();
            sum += this.bankCashMachines[i].getPayOutSum();
        }
        if(quantity == 0)
            return 0;
        return sum / quantity;
    }

    public double getPayInAverage() {
        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            quantity += this.bankCashMachines[i].getPayInQuantity();
            sum += this.bankCashMachines[i].getPayInSum();

        }
        if(quantity == 0)
            return 0;

        return sum / quantity;
    }

    public static void main(String[] args) {

        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[] {783.31, -1259, -88, 3500, -33.51, -1306.91, -125.03, -88, 4700, -2089.87});
        bankCashMachines[1] = new CashMachine(new double[] {111.31, -1671, -33, 2100, -333.51, -130.91, -1250.03, -88, 6700, -2089.87});
        bankCashMachines[2] = new CashMachine(new double[] {983.31, 1259, -888.21, 3777.99, -33.51, -1306.91, -125.03, -88, 9700, -2089.87});

        Bank bank = new Bank(bankCashMachines);

        System.out.println("The bank's balance is: " + bank.getBalanceBank());
        System.out.println("The pay out transactions quantity is: " + bank.getPayOutQuantity());
        System.out.println("The pay in transactions quantity is: " + bank.getPayInQuantity());
        System.out.println("The pay out transactions average is: " + bank.getPayOutAverage());
        System.out.println("The pay in transactions average is: " + bank.getPayInAverage());

    }
}
