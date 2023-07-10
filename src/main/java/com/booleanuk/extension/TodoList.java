package com.booleanuk.extension;

import java.time.format.DateTimeFormatter;
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

    public void clearTodoList() {
        tasks.clear();
        idCounter = 0;
    }

    public void changeTaskStatus(int id) {
        if (!tasks.containsKey(id))
            return;
        tasks.get(id).isCompleted = !tasks.get(id).isCompleted;
    }

    public String displayTasks() {
        StringBuilder result = new StringBuilder();
        result.append("Tasks to do: \n");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        for (int i = 0; i < idCounter; i++) {
            Task task = tasks.get(i);
            result.append(i)
                    .append("# ")
                    .append("Date of creation: ")
                    .append(task.dateOfCreation.format(pattern))
                    .append(" | ")
                    .append("Completed: ")
                    .append(task.isCompleted)
                    .append(" | ")
                    .append(task.text)
                    .append("\n");
        }

        return result.toString();
    }
}
