package com.booleanuk.core;

import java.util.*;

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

    public String displayCompletedTasks() {
        StringBuilder result = new StringBuilder();
        result.append("Completed tasks: \n");

        for (Map.Entry<String, Boolean> task : tasks.entrySet())
            if (task.getValue())
                result.append(task.getKey())
                        .append("\n");

        return result.toString();
    }

    public String displayInCompletedTasks() {
        StringBuilder result = new StringBuilder();
        result.append("InCompleted tasks: \n");

        for (Map.Entry<String, Boolean> task : tasks.entrySet())
            if (!task.getValue())
                result.append(task.getKey())
                        .append("\n");

        return result.toString();
    }

    public boolean removeTask(String text) {
        return tasks.remove(text) != null;
    }

    public String getTask(String text) {
        return tasks.containsKey(text) ?
                "Completed: " + tasks.get(text) + " | " + text :
                "There is no such task in the list.";
    }

    public String displayAlphabeticallyAscending() {
        List<String> keys = new ArrayList(tasks.keySet());
        Collections.sort(keys);
        StringBuilder result = new StringBuilder();
        result.append("Tasks sorted Ascending: \n");

        for (String key: keys)
            result.append("Completed: ")
                    .append(tasks.get(key))
                    .append(" | ")
                    .append(key)
                    .append("\n");

        return result.toString();
    }

    public String displayAlphabeticallyDescending() {
        List<String> keys = new ArrayList(tasks.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);

        StringBuilder result = new StringBuilder();
        result.append("Tasks sorted Descending: \n");

        for (String key: keys)
            result.append("Completed: ")
                    .append(tasks.get(key))
                    .append(" | ")
                    .append(key)
                    .append("\n");

        return result.toString();
    }
}
