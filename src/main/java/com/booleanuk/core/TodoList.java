package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {
    HashMap<String, Boolean> tasks = new HashMap<>();

    public boolean addTask(String text) {
        return tasks.put(text, false) == null;
    }

    public String displayTasks() {
        StringBuilder result = new StringBuilder();
        result.append("Tasks to do: \n");

        for (Map.Entry<String, Boolean> task : tasks.entrySet())
            result.append("Completed: ")
                .append(task.getValue())
                .append(" | ")
                .append(task.getKey())
                .append("\n");

        return result.toString();
    }

    public boolean changeTaskStatus(String text) {
        if (!tasks.containsKey(text))
            return false;

        return tasks.replace(text, !tasks.get(text)) != null;
    }
}
