package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {
    public HashMap<String, String> taskList;

    public TodoList(){
        this.taskList = new HashMap<>();
    }

    public boolean addTask(String task, String status){
        if(taskList.containsKey(task)){
            System.out.println("Task already exits");
            return false;
        }
        taskList.put(task, status);
        return true;
    }
    public void getAllTask(){
        if(taskList.isEmpty()){
            System.out.println("There is no task left");
        }
        for (Map.Entry<String, String> entry : taskList.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public void changeStatus(String task, String status){
        if(taskList.containsKey(task)){
            taskList.put(task,status);
        }

    }
    public static void main(String[] arg){
        TodoList object = new TodoList();
        object.addTask("Task1", "incomplete");
        object.addTask("Task2", "incomplete");
        object.getAllTask();
        object.changeStatus("Task1", "complete");
        object.changeStatus("Task2", "complete");
        object.getAllTask();


    }


}
