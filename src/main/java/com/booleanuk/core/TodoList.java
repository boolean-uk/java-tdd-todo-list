package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public Set<Task> tasks;

    public TodoList() {
        this.tasks = new HashSet<>();
    }
    public boolean addTask(Task newTask){
        return this.tasks.add(newTask);
    }

    public String showTasks() {

        String allTasks="";
        for (Task task: this.tasks){
            allTasks += "task: " +task.taskName + " is completed: " + task.isCompleted + "\n";
        }
        return allTasks;
    }
    public List<Task> getTasks() {
        return new ArrayList<>(this.tasks);
    }
    public void modifyCompletedValue(String taskNameToFind, boolean b) {

        for (Task task : tasks) {
            if (task.taskName.equals(taskNameToFind)) {
                task.isCompleted = b;
                return; // return when the task is found and updated
            }
        }
    }

    public List<Task> getCompletedTasksOnly() {
        List<Task> completedTasks = new ArrayList<>();
        for(Task task: this.tasks){
            if(task.isCompleted)
                completedTasks.add(task);
        }
        return completedTasks;
    }

    public List<Task> getUncompletedTasksOnly() {
        List<Task> uncompletedTasks = new ArrayList<>();
        for(Task task: this.tasks){
            if(!task.isCompleted)
                uncompletedTasks.add(task);
        }
        return uncompletedTasks;
    }
    public String findTask(String taskName) {
        for (Task task : this.tasks) {
            if (task.taskName.equals(taskName)) {
                return "Task was found";
            }
        }
        return "Task wasn't found";
    }

    public void removeTask(Task taskToDelete) {


        this.tasks.remove(taskToDelete);
//        for (Task task: this.tasks) {
//            System.out.println(task);
//            if (task.taskName.equals(taskName)) {
//                this.tasks.remove(task);
//            }
//        }

    }
    public List<Task> getTasksOrderedAlphabeticallyAscending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(task -> task.taskName));
        return sortedTasks;
    }

    public List<Task> getTasksOrderedAlphabeticallyDescending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing((Task task) -> task.taskName).reversed());
        return sortedTasks;
    }


}
