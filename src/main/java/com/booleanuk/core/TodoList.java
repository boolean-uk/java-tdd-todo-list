package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    List<Task> tasks = new ArrayList<>();

    public boolean add(Task task) {
        if (tasks.contains(task)) {
            return false;
        }
        else {
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
}
