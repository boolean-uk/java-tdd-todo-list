package com.booleanuk.core;

import java.util.*;

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
        List<Task> returningArray = new ArrayList<>();
        for (Task todo : todos) {
            if (todo.isCompleted()) {
                returningArray.add(todo);
            }
        }
        return returningArray;
    }

    List<Task> getIncompletedTasks() {
        List<Task> returningArray = new ArrayList<>();
        for (Task todo : todos) {
            if (!todo.isCompleted()) {
                returningArray.add(todo);
            }
        }
        return returningArray;
    }

    String search(Task task) {
        if (todos.contains(task)) {
            return "it was found";
        }
        return "it wasn't found";

    }

    void remove(List<Task> tasks) {
        todos.removeAll(tasks);
    }

    List<Task> ascOrder() {
        List<Task> returningArray = new ArrayList<>();
        String[] names = new String[todos.size()];
        int counter = 0;
        for (Task todo : todos) {
            names[counter] = todo.getName();
            counter++;
        }
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            for (Task todo : todos) {
                if (Objects.equals(todo.getName(), names[i])) {
                    returningArray.add(todo);
                }
            }
        }

        return returningArray;

    }

    List<Task> dscOrder() {
        List<Task> returningArray = new ArrayList<>();
        String[] names = new String[todos.size()];
        int counter = 0;
        for (Task todo : todos) {
            names[counter] = todo.getName();
            counter++;
        }
        Arrays.sort(names, Comparator.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            for (Task todo : todos) {
                if (Objects.equals(todo.getName(), names[i])) {
                    returningArray.add(todo);
                }
            }
        }

        return returningArray;

    }
}
