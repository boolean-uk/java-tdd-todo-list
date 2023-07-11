package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.*;


public class TodoListE {
    List<String> tasks;
    List<LocalDateTime> dates;

    public TodoListE() {
        tasks = new ArrayList<>();
        dates = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    }

    public int add(String task) {
        tasks.add(task);
        LocalDateTime creationTime = LocalDateTime.now();
        dates.add(creationTime);
        System.out.println("Added a new task!");
        return tasks.size();
    }

    public int getTime(int task) {
        LocalDateTime times = dates.get(task);
        System.out.println(times);
        return times.getHour();
    }

    public String seeAll() {
        return tasks.toString();
    }

    public String statusChange(String task, boolean complete) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            tasks.set(index, complete ? task + " [Complete]" : task + " [Incomplete]");
        }
        System.out.println("Successfully changed the status!");
        return tasks.toString();
    }

    public String getComplete() {
        List<String> completeTasks = new ArrayList<>();
        for (String task : tasks) {
            if (task.endsWith("[Complete]")) {
                completeTasks.add(task);
            }
        }
        return completeTasks.toString();
    }

    public String getIncomplete() {
        List<String> incompleteTasks = new ArrayList<>();
        for (String task : tasks) {
            if (task.endsWith("[Incomplete]")) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks.toString();
    }

    public String search(String task) {
        if (tasks.contains(task)) {
            return "Task was found.";
        } else {
            return "Task was not found.";
        }
    }

    public int remove(String task) {
        tasks.remove(task);
        return tasks.size();
    }

    public String sortAscend() {
        List<String> sortedTasks = new ArrayList<>(tasks);
        Collections.sort(sortedTasks);
        return sortedTasks.toString();
    }

    public String sortDescend() {
        List<String> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.reverseOrder());
        return sortedTasks.toString();
    }

    public String addID(String task, int ID) {
        int index = tasks.indexOf(task);
        if (!task.startsWith("[ID]")) {
                tasks.set(index,"[ID]" + ID + " " + task);}
        return tasks.get(index);
    }


}
