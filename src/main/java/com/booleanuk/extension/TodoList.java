package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    public List<com.booleanuk.core.Task> tasks = new ArrayList<>();

    public boolean addTask(String newTaskName){
        if (!tasks.contains(newTaskName)){
            com.booleanuk.core.Task task = new com.booleanuk.core.Task(newTaskName);
            tasks.add(task);
            return true;
        }
        else{
            return false;
        }

    }

    public String[] display(List<com.booleanuk.core.Task> arrayTasks){
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



    public List<com.booleanuk.core.Task> getTasks() {
        return tasks;
    }
    public String searchTaskByName(String name){
        for (com.booleanuk.core.Task task : tasks){
            if(task.getName().equals(name))
                return task.toString();
        }
        return "Task not found";
    }

    public void addTask(com.booleanuk.core.Task task){
        tasks.add(task);
    }

    public String removeTask(String name){
        for (com.booleanuk.core.Task task : tasks){
            if(task.getName().equals(name)){
                tasks.remove(task);
                return "Task removed";
            }
        }
        return "Task not found";
    }

    public String[] displayInAlphabeticalOrder(){
        List<com.booleanuk.core.Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(com.booleanuk.core.Task::getName))
                .collect(Collectors.toList());
        return display(sortedList);
    }

    public String[] displayInReverseAlphabeticalOrder(){
        List<com.booleanuk.core.Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        return display(sortedList);
    }
}