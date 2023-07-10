package com.booleanuk.core;

import java.util.*;
import java.util.stream.Collectors;

public class TodoList {
    List<Task> tasks = new ArrayList<>();

    public boolean add(Task task) {
        if (tasks.contains(task)) {
            return false;
        } else {
            tasks.add(task);
            return true;
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getCompleteTasks() {
        return tasks.stream().filter(t -> t.status.equals(Status.COMPLETE)).toList();
    }

    public List<Task> getIncompleteTasks() {
        return tasks.stream().filter(t -> t.status.equals(Status.INCOMPLETE)).toList();
    }

    public String search(Task task) {

        if (tasks.stream().anyMatch(t -> t == task)) {
            return task.description;
        } else {
            return "Task not found!";
        }
    }

    public boolean remove(Task task) {

        return tasks.remove(task);

    }

    public List<Task> getTaskInAscOrder() {
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.description.compareTo(o2.description);
            }
        });
        return tasks;
    }
}
