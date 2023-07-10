package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    public List<Task> tasks = new ArrayList<>();

    public boolean addTask(String newTaskName){
        if (!tasks.contains(newTaskName)){
            Task task = new Task (newTaskName);
            tasks.add(task);
            return true;
        }
        else{
            return false;
        }

    }

    public String[] display(List<Task> arrayTasks){
        String[] returnTaskList = new String[arrayTasks.size()];
        for(int i=0; i < arrayTasks.size(); i++){
            returnTaskList[i] = arrayTasks.get(i).toString();
        }
        return returnTaskList;
    }
    /*
    private String[] displayAll(){
        return display(tasks);
    }

     */

    //private boolean changeStatus(){}



    public List<Task> getTasks() {
        return tasks;
    }
    public String searchTaskByName(String name){
        for (Task task : tasks){
            if(task.getName().equals(name))
                return task.toString();
        }
        return "Task not found";
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public String removeTask(String name){
        for (Task task : tasks){
            if(task.getName().equals(name)){
                tasks.remove(task);
                return "Task removed";
            }
        }
        return "Task not found";
    }

    public String displayInAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName))
                .collect(Collectors.toList());
        return displayAll();
    }

    public String displayInReverseAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        return displayAll();
    }
}
