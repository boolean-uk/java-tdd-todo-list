package com.booleanuk.extension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
public class ToDoExtension {
    // In this extended class, the key is now the ID, while the string array contains the
    // name of the task, the time it was created and status
    // I copied the Todo-list Class and changed/added methods to fulfill the extended requirements
    // Some of the core class methods remain as I saw no reason to remove them.
    HashMap<String, String[]> taskList=new HashMap<String, String[]>();

    public boolean add(String taskId, String[] info){
        if(!taskList.containsKey(taskId)){
            taskList.put(taskId, info);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean display(){
        if (taskList.isEmpty()){
            return false;
        }
        else{
            for (String key:taskList.keySet()){
                System.out.println(taskList.get(key)[0]+ ", "+ taskList.get(key)[1]+ ", "+ taskList.get(key)[2]);
            }
            return true;
        }

    }

    public boolean changeName(String taskId, String name){

        if(taskList.containsKey(taskId)){
            String [] update=taskList.get(taskId);
            update[0]=name;
            taskList.replace(taskId, update);
            return true;
        }
        else{
            return false;
        }
    }


    public boolean changeStatus(String task){
        if(taskList.containsKey(task)){
            String [] update=taskList.get(task);
            update[2]="Complete";
            taskList.replace(task, update);
            return true;
        }
        else{
            return false;
        }
    }

    // the boolean order decides which status the todo-list will be displaying
    // true corresponds to complete, false to incomplete
    public ArrayList<String> statusDisplay(String status){
        ArrayList<String> tasks=new ArrayList<>();
        if (taskList.isEmpty()){
            return tasks;
        }
        else{
            for(String key:taskList.keySet()){
                if (taskList.get(key)[2]==status){
                    tasks.add(key);
                }
            }
            return tasks;
        }

    }

    public boolean search(String task){
        if (!taskList.containsKey(task)) {
            System.out.println("Task not found");
        }
        return taskList.containsKey(task);
    }

    String[] findTask(String taskId){
        if (!taskList.containsKey(taskId)) {
            return new String[]{"Task not found"};
        }
        return taskList.get(taskId);
    }

    public boolean remove(String task){
        if (taskList.containsKey(task)){
            taskList.remove(task);
            return true;
        }
        else{
            return false;
        }
    }
    // the boolean order decides which order the todo-list will be displayed
    // true corresponds to ascending, false do descending
    public String[] sort(boolean order) {
        if (taskList.isEmpty()) {
            return new String[]{};
        } else {

            String[] sorted = new String[taskList.size()];
            int i=0;
            for (String key: taskList.keySet()){
                sorted[i]=key;
                i+=1;
            }


            if (order == true) {
                Arrays.sort(sorted);
            } else if (order == false) {
                Arrays.sort(sorted, Comparator.reverseOrder());

            }
            return sorted;
        }
    }
}