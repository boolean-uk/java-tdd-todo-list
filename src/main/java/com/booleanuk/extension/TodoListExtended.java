package com.booleanuk.extension;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Task {
    private int id;
    private String title;
    private String description;
    private boolean status;
    private LocalDateTime creationDateTime;

    public Task(int id, String title, String description, Boolean status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.creationDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Task{id=" + id + ", title='" + title + "', description='" + description + "', status='" + status + "'}";
    }
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }
}

class TodoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }


    public List<Task> getCompleteTasks() {
        List<Task> completeTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus()) {
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.getStatus()) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public Task searchTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getAlphabeticalTasks(boolean ascending) {
        tasks.sort(Comparator.comparing(Task::getTitle));
        ArrayList<Task> sortedTasks = new ArrayList<>(tasks);

        if (!ascending) {
            Collections.reverse(sortedTasks);
        }
        return sortedTasks;
    }

    public void changeTaskStatus(Task task, Boolean status) {
        task.setStatus(status);
    }

    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public void updateTaskName(int taskId, String newTitle) {
        Task task = getTaskById(taskId);
        task.setTitle(newTitle);
    }

    public void changeTaskStatusById(int taskId, boolean newStatus) {
        Task task = getTaskById(taskId);
        task.setStatus(newStatus);
    }
}
