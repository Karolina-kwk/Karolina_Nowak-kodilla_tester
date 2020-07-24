package com.kodilla.abstracts.homework;

import javax.xml.crypto.Data;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void showResponsibilities(){
        System.out.println("Person: " + firstName + " have responsibilities: " + job.getResponsibilities());
    }

    public String getFirstName() {
        return firstName;
    }

    public Job getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }







}
