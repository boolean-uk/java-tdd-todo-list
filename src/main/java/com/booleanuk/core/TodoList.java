package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    public ArrayList<Task> taskList;
    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }


    public void addTask(String task){
        Task newTask = new Task(task, false);
        taskList.add(newTask);
    }



    public String showAll(){

        return getTaskList().toString();
    }


    public String showCompletedTasks() {
        ArrayList<Task> newList = new ArrayList<>();

        for (Task task : taskList) {
            if(task.getStatus()){
                newList.add(task);
            }
        }
        return newList.toString();
    }

    public String showIncompleteTasks() {
        ArrayList<Task> newList = new ArrayList<>();

        for (Task task : taskList) {
            if(!task.getStatus()){
                newList.add(task);
            }
        }
        return newList.toString();
    }

    public String search(String taskSearch){
        String output ="";
        for (Task task : taskList) {
            if(task.getTask().equals(taskSearch)){
                output = task.toString();
            }else{
                output = "Task does not exist";
            }
        }
        return output;
    }

    public void removeTask(String taskRemove){
        ArrayList<Task> newList = new ArrayList<>();

        for (Task task : taskList) {
            if(!task.getTask().equals(taskRemove)){
                newList.add(task);
            }
        }
        this.taskList = newList;
    }

    public void sortListAsc(){
        //From chatgpt, couldnt figure out the problem with object array
        Collections.sort(taskList, Comparator.comparing(Task::getTask));
    }

    public void sortListDesc(){
       Collections.sort(taskList,Comparator.comparing(Task::getTask).reversed());
    }

}
