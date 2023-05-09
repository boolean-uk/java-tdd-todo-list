package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {
//    HashMap <String, Boolean> tasks = new HashMap<>();
    ArrayList<Task> tasks = new ArrayList<>();
    private boolean _searchTask(String task) {
        for (Task t: tasks) {
            if (t.name.equals(task)) {
                return true;
            }
        }
        return false;
    }

    public String searchTask(String task) {
        return (_searchTask(task) ? "The task was found." : "The task could not be found.");
    }

    public void addTask(Task task) {
        if(_searchTask(task.name)) {
            System.out.println("This task already exists. Please use a new name if you want to create a new task, or use the updateTask method");
        } else {
            this.tasks.add(task);
        }
    }

    public String displayAllTasks() {
        if (this.tasks.isEmpty()) {
            return "No tasks were found.";
        }

        String result = "";
        for (Task task: tasks) {
            result += task.name + ", " + ((task.completed) ? "complete" : "incomplete") + "\n";
        }
        return result;
    }

    public boolean updateTask(String task) {
        if(!_searchTask(task)) {
            return false;
        }

        for (Task t : this.tasks) {
            if (t.name.equals(task)) {
                t.completed = !t.completed;
                break;
            }
        }
        return true;
    }


}
