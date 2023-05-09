package com.booleanuk.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TodoList {
//    HashMap <String, Boolean> tasks = new HashMap<>();
    ArrayList<Task> tasks = new ArrayList<>();
    private Task _searchTask(String task) {
        for (Task t: tasks) {
            if (t.name.equals(task)) {
                return t;
            }
        }
        return null;
    }

    public String searchTask(String taskName) {
        return (_searchTask(taskName) != null ? "The task was found." : "The task could not be found.");
    }

    public void addTask(Task task) {
        if(_searchTask(task.name) != null) {
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

    public boolean updateTask(String taskName) {

        if(_searchTask(taskName) == null) {
            return false;
        }

        for (Task t : this.tasks) {
            if (t.name.equals(taskName)) {
                t.completed = !t.completed;
                break;
            }
        }
        return true;
    }

    public ArrayList<Task> getCompletedTasks(){
        ArrayList<Task> completedTasks = new ArrayList<>();

        for(Task task : this.tasks){
            if(task.completed) completedTasks.add(task);
        }
        if(completedTasks.isEmpty()) System.out.println("No completed tasks were found");
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks(){
        ArrayList<Task> incompleteTasks = new ArrayList<>();

        for(Task task : this.tasks){
            if(!task.completed) incompleteTasks.add(task);
        }
        if(incompleteTasks.isEmpty()) System.out.println("No incomplete tasks were found");
        return incompleteTasks;
    }


    public boolean removeTask(String taskName){
        Task task = _searchTask(taskName);
        if(task != null){
            this.tasks.remove(task);
            return true;
        }
        System.out.println("Given task could not be found");
        return false;
    }

    public String displayTasksAlphabeticallyAscending(){
        if(this.tasks.isEmpty()) return "No tasks to be sorted";

        String result = "";
        this.tasks.sort(Comparator.comparing(task -> task.name));

        for(Task task : this.tasks){
            result += task.name + ", " + ((task.completed) ? "complete" : "incomplete") + "\n";
        }
        return result;
    }

    public String displayTasksAlphabeticallyDescending(){
        if(this.tasks.isEmpty()) return "No tasks to be sorted";

        String result = "";

        this.tasks.sort(Comparator.comparing((Task task) -> task.name).reversed());


        for(Task task : this.tasks){
            result += task.name + ", " + ((task.completed) ? "complete" : "incomplete") + "\n";
        }
        return result;
    }

}
