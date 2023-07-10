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
}
