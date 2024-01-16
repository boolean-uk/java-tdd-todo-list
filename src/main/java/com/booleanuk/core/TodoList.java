package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, String> toDoList;
    public TodoList(){
        this.toDoList = new HashMap<String, String>();
    }

    public boolean addTask(String task){
            if (toDoList.containsKey(task)) {
                return false;
            }
            toDoList.put(task, "incomplete");
            return true;
    }
    public String changeStatus(String task){
        String out = "";
        for (String i : toDoList.keySet()) {
            if (i.equals(task)){
                if (toDoList.get(i).contains("incomplete")){
                    out =  toDoList.get(i).replace("incomplete", "complete");
                }else{
                    this.toDoList.put(task, "Incomplete");
                    out = toDoList.get(i);
                }
            }
        }
        return out;
    }
    public void seeAllTasks(){
        System.out.println(toDoList.toString());
    }


}
