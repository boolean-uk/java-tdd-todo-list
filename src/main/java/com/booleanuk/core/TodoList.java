package com.booleanuk.core;

import java.util.*;

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

    public boolean removeTask(String task) {
        if (taskList.containsKey(task)) {
            taskList.remove(task);
            return true;
        }
            System.out.println("There is no matching task");
            return false;
    }

    public String searchTask(String task){
        if(taskList.containsKey(task)){
            return taskList.get(task);
        }
        return "The task not found";

    }

    public ArrayList<String> getTaskAscending(){
        ArrayList<String> taskListKey = new ArrayList<>(taskList.keySet());
        Collections.sort(taskListKey);
        return taskListKey;
    }

    public ArrayList<String> getTaskDescending(){
        ArrayList<String> taskListKey = new ArrayList<>(taskList.keySet());
        Collections.sort(taskListKey);
        Collections.reverse(taskListKey);
        return taskListKey;
    }
    public ArrayList<String> getCompleteTask(){
        ArrayList<String> completeTask = new ArrayList<>();
        for (Map.Entry<String, String> entry : taskList.entrySet()){
            if(entry.getValue().equals("complete")){
                completeTask.add(entry.getKey());
            }
        }
        return completeTask;
    }

    public ArrayList<String> getInCompleteTask(){
        ArrayList<String> inCompleteTask = new ArrayList<>();
        for(Map.Entry<String, String> entry : taskList.entrySet()){
            if(entry.getValue().equals("incomplete")){
                inCompleteTask.add(entry.getKey());
            }
        }
        return inCompleteTask;

    }
    public static void main(String[] arg){
        TodoList object = new TodoList();
        // print all tasks
        object.addTask("Task1", "incomplete");
        object.addTask("Task2", "incomplete");
        System.out.println("Task list: ");
        object.getAllTask();
        // change task status
        object.changeStatus("Task1", "complete");
        object.changeStatus("Task2", "complete");
        System.out.println("Update task status: ");
        object.getAllTask();
        // remove task 1
        object.removeTask("Task1");
        System.out.println("Task list after remove one task: ");
        object.getAllTask();
        // remove task 2
        object.removeTask("Task2");
        System.out.println("After remove two task: ");
        object.getAllTask();

        object.removeTask("Task1");

        object.addTask("Task4", "incomplete");
        object.addTask("Task5", "incomplete");
        System.out.println(object.searchTask("Task4"));
        System.out.println(object.searchTask("Task6"));





    }


}
