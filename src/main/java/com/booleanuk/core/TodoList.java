package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TodoList {
    List<Task> todos = new ArrayList<>();
// this is a test:)

    void add(Task task) {
        todos.add(task);
    }

    List<Task> view() {
        return todos;
    }

    void changeStatus(Task task) {
        for (Task todo : todos) {
            if (Objects.equals(todo.getName(), task.getName())) {
                todo.toggleCompleted();
            }
        }

    }

    List<Task> getCompletedTasks() {
        return new ArrayList<>();

    }

    List<Task> getIncompletedTasks() {
        return new ArrayList<>();

    }

    String search(Task task) {
        return "hello";

    }

    void remove(List<Task> tasks) {

    }

    List<Task> ascOrder() {
        return new ArrayList<>();

    }

    List<Task> dscOrder() {
        return new ArrayList<>();

    }
}
