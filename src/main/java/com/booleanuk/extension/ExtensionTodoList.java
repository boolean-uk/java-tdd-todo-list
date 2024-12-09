package com.booleanuk.extension;

import java.util.*;


public class ExtensionTodoList {
    public Map<Integer,ExtensionTask> tasks = new HashMap();
    private int idCounter;
    public ExtensionTask getTaskById(int id){
        if(tasks.containsKey(id)){
            return tasks.get(id);
        }
        return null;
    }

    public boolean changeStatusById(int id){
        if(tasks.containsKey(id)){
            tasks.get(id).changeStatus();
            return true;
        }return false;
    }

    public String changeNameById(int id, String name){
        if(tasks.containsKey(id)){
            tasks.get(id).setName(name);
        }
        return tasks.get(id).getName();
    }


    public String getDateAndTime(int id){
        if(tasks.containsKey(id)){
            return tasks.get(id).getCreationDate().toString();
        }
        return "Task not found";
    }
    public boolean addTask(String name) {
        for(ExtensionTask task : tasks.values()) {
            if(task.getName().equals(name))
                return false;
        }
        tasks.put(idCounter++, new ExtensionTask(name));
        return true;
    }

    public boolean addTask(ExtensionTask taskAdded) {
        for(ExtensionTask task : tasks.values()) {
            if(task.getName().equals(taskAdded.getName()))
                return false;
        }
        tasks.put(idCounter++, taskAdded);
        return true;
    }


}