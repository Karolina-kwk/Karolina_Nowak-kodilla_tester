package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> students = new HashMap<>();
        Principal joanna =  new Principal("Joanna", "Nowakowska", "High School");
        Principal edmund = new Principal("Edmund", "Sigiel", "Polski Uniwersytet Ludowy");
        Principal hanna = new Principal("Hanna", "Kurta", "Primary School nr 2");

        School joannaSchool = new School(30.0, 21.0, 26.0, 25.0, 16.0);
        School edmundSchool = new School(35.0, 22.0, 16.0, 10.0, 11.0);
        School hannaSchool = new School(22.0, 23.0, 35.0, 15.0, 18.0, 17.0);


        students.put(joanna, joannaSchool);
        students.put(edmund, edmundSchool);
        students.put(hanna, hannaSchool);


        for (Map.Entry<Principal, School> student: students.entrySet()){
            System.out.println("Principal "+ student.getKey().getFirstname() +" "+ student.getKey().getLastname() +" runs "+ student.getKey().getSchoolname() +" with total number of students : "+ student.getValue().getSum());
        }

    }
}
