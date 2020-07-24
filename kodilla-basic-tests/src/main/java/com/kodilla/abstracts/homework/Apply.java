package com.kodilla.abstracts.homework;

public class Apply {

    public static void main(String[] args) {
        Job job = new DataAnalyst(3200, "Keeping up with financial information.");
        Person person = new Person("Michał", 32,job);
        person.showResponsibilities();

        Job job1 = new Engineer(7500,"Supervising project development");
        Person person1 = new Person("Dominik", 45, job1);
        person1.showResponsibilities();


    }
}
