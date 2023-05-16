package com.booleanuk.extension;

import com.booleanuk.extension.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {

    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }
    public Task getById(int id) {
        List<Task> list = tasks.stream().filter(x -> x.id == id).collect(Collectors.toList());
        if (list.isEmpty()) {
            return null;
        } else {
            return tasks.stream().filter(x -> x.id == id).collect(Collectors.toList()).get(0);
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

    public boolean changeStatusById(int id) {
        Task updatedTask = getById(id);
        if (updatedTask == null) {
            return false;
        } else {
            updatedTask.status = !updatedTask.status;
            return true;
        }
    }

    public LocalDateTime getDateTimeById(int id) {
        Task updatedTask = getById(id);
        if (updatedTask == null) {
            return null;
        } else {
            return updatedTask.timeCreated;
        }
    }

}
