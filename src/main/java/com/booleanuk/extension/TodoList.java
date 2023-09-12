package com.booleanuk.extension;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TodoList {
    public TreeMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new TreeMap<String, Boolean>();
    }

    public boolean addTask(String task) {
        if (task.isBlank()) {
            return false;
        } else {
            return this.tasks.putIfAbsent(task.strip(), false) == null;
        }
    }

    public String getTasks() {
        if (this.tasks.isEmpty()) {
            return "No tasks in your list yet!";
        }
        return "Tasks: " + String.join(", ", this.tasks.keySet());
    }

    public String changeTaskStatus(String task) {
        if (this.tasks.containsKey(task)) {
            this.tasks.put(task, !this.tasks.get(task));
            return String.format("Task '%s' is now set to %s.",
                    task,
                    this.tasks.get(task) ? "complete" : "incomplete");
        } else {
            return "Couldn't update status, task doesn't exist";
        }
    }

    public String getCompletedTasks() {
        String completedTasks = this.tasks.entrySet()
                .stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        if (completedTasks.isEmpty()) {
            return "No completed tasks";
        } else {
            return completedTasks;
        }
    }
    public String getIncompleteTasks() {
        String incompleteTasks = this.tasks.entrySet()
                .stream()
                .filter(entry -> !entry.getValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        if (incompleteTasks.isEmpty()) {
            return "No incomplete tasks";
        } else {
            return incompleteTasks;
        }
    }
    public String searchForTask(String task) {
        return this.tasks.containsKey(task) ?
                String.format("Task %s is %s.",task,(this.tasks.get(task)?"complete":"incomplete")):
                "No such task";

    }

    public boolean removeTask(String task) {
        return this.tasks.remove(task) != null;

    }

    public String getSortedTasksAscending() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Boolean> entry : this.tasks.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()?"completed":"incomplete").append("\n");
        }
        return sb.isEmpty() ? "The to-do list is empty!" : String.valueOf(sb);
    }
    public String getSortedTasksDescending() {
        TreeMap<String, Boolean> descendingTreeMap = new TreeMap<>(Collections.reverseOrder());
        descendingTreeMap.putAll(this.tasks);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Boolean> entry : descendingTreeMap.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()?"completed":"incomplete").append("\n");
        }

        return  sb.isEmpty() ? "The to-do list is empty!" : String.valueOf(sb);
    }
}
