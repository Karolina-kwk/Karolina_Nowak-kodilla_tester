package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ania", new Teacher("Nowakowska")));
        students.add(new Student("Tymek", new Teacher("Sobocinska")));
        students.add(new Student("Kamila", new Teacher("Matczak")));
        students.add(new Student("Majda", null));
        students.add(new Student("Piotr", new Teacher("Opajło")));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student is: " + student.getName() + "  //  Teacher is: " + teacherName.getName());
        }

    }
}
