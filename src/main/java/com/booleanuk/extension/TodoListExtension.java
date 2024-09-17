package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoListExtension {

    public ArrayList<TaskExtension> tasks;

    public TodoListExtension() {
        this.tasks = new ArrayList<>();
    }

    public TaskExtension addTask(String name) {
        TaskExtension task = new TaskExtension(name);
        this.tasks.add(task);
        return task;
    }

    public String showTasks(ArrayList<TaskExtension> tasksToPrint) {
        StringBuilder tasksString = new StringBuilder("Name\t\t\t\tStatus\n");
        for(TaskExtension task : tasksToPrint) {
            tasksString.append(task.getName()).append("\t\t\t\t");
            if(task.getStatus()) {
                tasksString.append("Complete\n");
            } else {
                tasksString.append("Incomplete\n");
            }
        }
        return tasksString.toString();

    }

    public String showCompleteTasks() {
        ArrayList<TaskExtension> tasksToPrint = new ArrayList<>();
        for(TaskExtension task : this.tasks) {
            if(task.getStatus()) {
                tasksToPrint.add(task);
            }
        }
        return showTasks(tasksToPrint);
    }

    public String showIncompleteTasks() {
        ArrayList<TaskExtension> tasksToPrint = new ArrayList<>();
        for(TaskExtension task : this.tasks) {
            if(!task.getStatus()) {
                tasksToPrint.add(task);
            }
        }
        return showTasks(tasksToPrint);
    }

    public String search(String name) {
        for(TaskExtension task : this.tasks) {
            if(task.getName().equals(name)) {
                return name + " was found";
            }
        }
        return name + " was not found";
    }

    public boolean delete(String name) {
        for(TaskExtension task : this.tasks) {
            if(task.getName().equals(name)) {
                this.tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public ArrayList<TaskExtension> orderTasksAsc() {
        this.tasks.sort(new Comparator<TaskExtension>() {
            @Override
            public int compare(TaskExtension t1, TaskExtension t2) {
                return t1.getName().toLowerCase().compareTo(t2.getName().toLowerCase());
            }

        });
        return this.tasks;
    }

    public ArrayList<TaskExtension> orderTasksDesc() {
        Collections.reverse(orderTasksAsc());
        return this.tasks;
    }

    public TaskExtension searchById(int id) {
        for (TaskExtension task : this.tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public boolean setNameById(int id, String newName) {
        TaskExtension task = searchById(id);
        if (task != null) {
            task.setName(newName);
            return true;
        }
        return false;
    }


    public boolean setStatusById(int id, boolean newStatus) {
        TaskExtension task = searchById(id);
        if(task != null) {
            task.setStatus(newStatus);
            return true;
        }
        return false;
    }
}
