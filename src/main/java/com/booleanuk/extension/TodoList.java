package com.booleanuk.extension;

import java.util.HashMap;

public class TodoList {
    private int idCounter = 0;
    final HashMap<Integer, Task> tasks = new HashMap<>();

    public void addTask(String text) {
        Task newTask = new Task(text);
        tasks.put(idCounter, newTask);
        idCounter++;
    }

    public Task getTask(int id) {
        return tasks.getOrDefault(id, null);
    }

    public boolean updateTaskName(int id, String text) {
        if (!tasks.containsKey(id))
            return false;
        tasks.get(id).text = text;
        return true;
    }

    public void changeTaskStatus(int id) {
        if (!tasks.containsKey(id))
            return;
        tasks.get(id).isCompleted = !tasks.get(id).isCompleted;
    }
}
