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

    public boolean changeStatus(Task taskName){
        boolean state = false;

        if (taskName.getStatus() == true){
            taskName.status =false;
            state = false;
        }
        else if (taskName.getStatus() == false) {
            taskName.status = true;
            state =true;
        }
        return state;
    }

    /*
    private String[] displayAll(){
        return display(tasks);
    }

     */





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

    public String[] displayInAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName))
                .collect(Collectors.toList());
        return display(sortedList);
    }

    public String[] displayInReverseAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        return display(sortedList);
    }
}
