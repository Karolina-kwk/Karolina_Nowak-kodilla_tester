package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Collecting orders",LocalDate.of(2020,8,12), LocalDate.of(2020,9,12) ));
        tasks.add(new Task("Sending requests to suppliers", LocalDate.of(2020,2,24), LocalDate.of(2020,4,4) ));
        tasks.add(new Task("Phone calls", LocalDate.of(2020,3,26), LocalDate.of(2020, 4, 7)));
        tasks.add(new Task("Safety check",LocalDate.of(2020, 5, 14), LocalDate.of(2020, 6, 14) ));
        tasks.add(new Task("Managing Website",LocalDate.of(2020, 6, 5), LocalDate.of(2020,10,20) ));
        return tasks;
    }
}
