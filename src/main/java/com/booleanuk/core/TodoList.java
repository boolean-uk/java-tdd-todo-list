package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TodoList {
    HashMap<Integer, Task> taskList;
    int id = 1;

    public TodoList() {
        taskList = new HashMap<>();
    }

    public boolean add(String description) {
        Task newTask = new Task(description,false);
        for (Task currentTask:taskList.values()) {
            if (currentTask.getDescription().equalsIgnoreCase(description)) {
                return false;
            }
        }
        taskList.put(this.id,newTask);
        this.id ++;
        return true;
    }

    public String doShowTaskList() {
        String temp = "";
        for (int id : taskList.keySet()) {
            temp += "Task " + id + ": " + taskList.get(id).toString() + "\n";
        }
        return temp;
    }

    public boolean doSetCompletion(int Id, boolean completion) {
        if (taskList.containsKey(Id)) {
            taskList.get(Id).setCompletion(completion);
            return true;
        } else {
            return false;
        }
    }

    public String doShowCompleted() {
        String temp="";
        for (int id: taskList.keySet()) {
            if (taskList.get(id).getCompletion()) {
                temp += "Task " + id + ": " + taskList.get(id).toString() + "\n";
            }
        }
        return temp;
    }

    public String doShowIncomplete() {
        String temp="";
        for (int id: taskList.keySet()) {
            if (!taskList.get(id).getCompletion()) {
                temp += "Task " + id + ": " + taskList.get(id).toString() + "\n";
            }
        }
        return temp;
    }

    public String search(String Description) {
        for (int id : taskList.keySet()) {
            if (taskList.get(id).getDescription().equals(Description)){
                return "Task " + id + ": " + taskList.get(id).toString() + "\n";
            }
        }
        return "Task doesn't exist";
    }

    public String search(int Id) {
        for (int id : taskList.keySet()) {
            if (id == Id) {
                return "Task " + id + ": " + taskList.get(id).toString() + "\n";
            }
        }
        return "Task doesn't exist";
    }

    public boolean remove(String description) {
        for (int id : taskList.keySet()) {
            if (taskList.get(id).getDescription().equals(description)){
                taskList.remove(id);
                return true;
            }
        }
        return false;
    }

    public String doShowAscending() {
        ArrayList<String> ascendingTasks = new ArrayList();
        String temp="";
        for (Task task : taskList.values()){
            ascendingTasks.add(task.description);
        }
        Collections.sort(ascendingTasks);
        for (String desc: ascendingTasks) {
            temp += search(desc);
        }
        return temp;
    }

    public String doShowDescending() {
        ArrayList<String> ascendingTasks = new ArrayList();
        String temp="";
        for (Task task : taskList.values()){
            ascendingTasks.add(task.description);
        }
        Collections.sort(ascendingTasks);
        Collections.reverse(ascendingTasks);
        for (String desc: ascendingTasks) {
            temp += search(desc);
        }
        return temp;
    }

    public boolean doUpdateDescription(int Id,String description) {
        for (int id : taskList.keySet()) {
            if (id == Id) {
                taskList.get(id).setDescription(description);
                return true;
            }
        }
        return false;
    }

}
