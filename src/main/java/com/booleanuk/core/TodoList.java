package com.booleanuk.core;

import java.util.*;

public class TodoList {
    HashMap<String, Boolean> todoList;

    public HashMap<String, Boolean> getTasks() {
        return todoList;
    }

    public TodoList() {
        this.todoList = new HashMap<>();
    }

    // Keys with names made into arraylist
    public List<String> getAllTasks(){

        return new ArrayList<>(todoList.keySet());

    }

    public boolean addTask(String task) {

        if (todoList.containsKey(task)) {

            return false;

        } else {

            // Add initial status false
            todoList.put(task, false);
            return true;

        }
    }


    public boolean changeStatusTasks(String task, boolean status) {

        if (todoList.containsKey(task)) {

            // Current status and toggle status
            boolean currentStatus = todoList.get(task);
            todoList.put(task, status);
            return true;

        } else {

            return false;

        }
    }

    public ArrayList<String> getCompletedTasks(){

        ArrayList<String> trueList = new ArrayList<>();
        for(Map.Entry<String, Boolean> element : todoList.entrySet()){
            if(element.getValue() .equals(true)){
                trueList.add(element.getKey());
            }

        }

        return trueList;
    }

    public ArrayList<String> getUnCompletedTasks(){

        ArrayList<String> trueList = new ArrayList<>();
        for(Map.Entry<String, Boolean> element : todoList.entrySet()){
            if(element.getValue().equals(false)){
                trueList.add(element.getKey());
            }

        }

        return trueList;

    }

    public String searchTask(String key){

        if (todoList.containsKey(key))
            return "Exists";
        else
            return "Not Exists";
    }

    public void removeTasks(String key){

        todoList.remove(key);
    }

    public ArrayList<String> ascendingTasks(){

        ArrayList<String> testList = new ArrayList<>(this.todoList.keySet());
        testList.sort(null);

        return testList;
    }

    public ArrayList<String> descendingTasks(){

        ArrayList<String> testList = new ArrayList<>(this.todoList.keySet());
        testList.sort(Comparator.reverseOrder());

        return testList;
    }


}


