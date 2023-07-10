package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Task> tasks = new ArrayList<>();

    public Task getTask(int id){
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .get();
    }

    public void updateTask(String content, int id){
        Task task = tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get();
        task.setContent(content);
    }
}
