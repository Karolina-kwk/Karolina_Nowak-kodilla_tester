package com.kodilla.stream.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlineList = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlineList);
    }
    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }


}
