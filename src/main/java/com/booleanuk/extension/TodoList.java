package com.booleanuk.extension;

import com.booleanuk.extension.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }
    public Task getById(int id) {
        List<Task> list = tasks.stream().filter(x -> x.id == id).toList();
        if (list.isEmpty()) {
            return null;
        } else {
            return tasks.stream().filter(x -> x.id == id).toList().get(0);
        }
    }

    public boolean updateNameById(int id, String name) {
        Task updatedTask = getById(id);
        if (updatedTask == null) {
            return false;
        } else {
            updatedTask.name = name;
            return true;
        }
    }

}
