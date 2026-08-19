package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> tasks;
    private int nextId = 1;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String name) {
        this.tasks.add(new Task(name, nextId));
        this.nextId++;
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void changeStatus(String name, boolean status) {
        for (Task task : this.tasks) {
            if (task.getName().equals(name)) {
                task.setStatus(status);
            }
        }
    }

    public List<Task> getCompleted() {
        List<Task> completedTasks = new ArrayList<Task>();
        for (Task task : this.tasks) {
            if (task.isStatus() == true) {
                completedTasks.add(task);
            }

        }
        return completedTasks;
    }

    public List<Task> getIncompleted() {
        List<Task> IncompletedTasks = new ArrayList<Task>();
        for (Task task : this.tasks) {
            if (task.isStatus() == false) {
                IncompletedTasks.add(task);
            }

        }
        return IncompletedTasks;
    }

    public String searchTask(String name) {
        String searchedTask = "Task not found";
        for (Task task : this.tasks) {
            if (task.getName().equals(name)) {
                searchedTask = name;
            }
            
        }
        return searchedTask;
    }

    public void deleteTask(String name) {
        Task taskToDelete = null;

        for (Task task : this.tasks) {
            if (task.getName().equals(name)) {
                taskToDelete = task;
            }
        }
        if (taskToDelete != null) {
            this.tasks.remove(taskToDelete);
        }
    }

    public List<Task> getAscendingList() {
        List<Task> sorted = new ArrayList<>(this.tasks);

        for (int i = 0; i < sorted.size() - 1; i++) {
            for (int j = 0; j < sorted.size() - 1 - i; j++) {
                Task current = sorted.get(j);
                Task next = sorted.get(j + 1);

                if (current.getName().compareTo(next.getName()) > 0) {
                    sorted.set(j, next);
                    sorted.set(j + 1, current);
                }
            }
        }
        return sorted;
    }


    public List<Task> getDescendingList() {
        List<Task> sorted = new ArrayList<>(this.tasks);

        for (int i = 0; i < sorted.size() - 1; i++) {
            for (int j = 0; j < sorted.size() - 1 - i; j++) {
                Task current = sorted.get(j);
                Task next = sorted.get(j + 1);

                if (current.getName().compareTo(next.getName()) < 0) {
                    sorted.set(j, next);
                    sorted.set(j + 1, current);
                }
            }
        }
        return sorted;
    }

    public Task getTaskById(int id) {
        for (Task task : this.tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;

    }

    public void changeNameById(int id, String newName) {
        Task task = getTaskById(id);

        if (task != null) {
            task.setName(newName);
        }
    }

    public void changeStatus(int id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setStatus(!task.isStatus());
        }
    }


}
