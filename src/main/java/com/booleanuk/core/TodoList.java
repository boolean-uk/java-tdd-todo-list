package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TodoList {

    private List<Task> tasks = new ArrayList<>();



    public int add(Task task) {

        tasks.add(task);
        return task.getId();
    }

    public List<String> getAll() {
        return tasks.stream().map(Task::toString).toList();
    }

    public boolean toggleTaskStatus(int id) {

    }
}
