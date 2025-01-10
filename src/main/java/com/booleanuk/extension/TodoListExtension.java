package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.UUID;

public class TodoListExtension {

    ArrayList<TaskExtension> tasks = new ArrayList<>();


    public boolean add(TaskExtension task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
            return true;
        }
        return false;
    }

    public ArrayList<TaskExtension> viewTasks() {
        return tasks;
    }

    public ArrayList<TaskExtension> viewIncompleteTasks() {
        ArrayList<TaskExtension> incomplete = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
            if (!task.complete) {
                incomplete.add(task);
            }
        }
        return incomplete;
    }

    public ArrayList<TaskExtension> viewCompleteTasks() {
        ArrayList<TaskExtension> complete = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
            if (task.complete) {
                complete.add(task);
            }
        }
        return complete;
    }

    public TaskExtension searchTask(TaskExtension task) {
        if(tasks.contains(task)) {
            return task;
        }
        System.out.println("Task not found!");
        return null;
    }

    public void removeTask(TaskExtension task) {
        this.tasks.remove(task);

    }

    ArrayList<String> alphabeticallyAscView() {
        ArrayList<String> names = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
            names.add(task.name);

        }
        names.sort(null);
        return names;
    }

    ArrayList<String> alphabeticallyDescView() {
        ArrayList<String> names = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
            names.add(task.name);

        }
        names.sort(Comparator.reverseOrder());
        return names;
    }

    public void updateTaskNameByID(UUID uid, String newName)  {
        for (TaskExtension task : this.tasks) {
            if (task.uid == uid) {
                task.name = newName;
            }
        }
    }

    public void updateTaskStatusByID(UUID uid, boolean newStatus) {
        for (TaskExtension task : this.tasks) {
            if (task.uid == uid) {
                task.changeStatus(newStatus);
            }
        }
    }

    TaskExtension getTaskByID(UUID uid) {
        for (TaskExtension task : this.tasks) {
            if (task.uid == uid) {
                return task;
            }
        } return null;
    }

}
