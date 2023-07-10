package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
}
