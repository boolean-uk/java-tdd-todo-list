package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {

    ArrayList <Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name){
        tasks.add(new Task(name));
    }

    public ArrayList<Task> getList() {
        return tasks;
    }

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getIsComplete()){
                completedTasks.add(tasks.get(i));
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompletedTasks() {
        ArrayList<Task> incompletedTasks = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (!tasks.get(i).getIsComplete()){
                incompletedTasks.add(tasks.get(i));
            }
        }
        return incompletedTasks;
    }

    public String search(String name) {
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).name.equals(name)){
                return "Task was found in the list";
            }
        }
        return "This task was not found";
    }

    public void removeTask(String name){
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).name.equals(name)){
                tasks.remove(i);
                break;
            }
        }
    }

    public ArrayList<Task> getAscOrder(){
        ArrayList<Task> ascList = new ArrayList<>();
        ascList = tasks;
        ascList.sort((o1, o2) -> o1.name.compareTo(o2.name));
        return ascList;
    }

    public ArrayList<Task> getDescOrder(){
        ArrayList<Task> descList = new ArrayList<>();
        descList = tasks;
        Collections.reverse(descList);
        descList.sort((o1, o2) -> o1.name.compareTo(o2.name));
        Collections.reverse(descList);
        return descList;
    }
}