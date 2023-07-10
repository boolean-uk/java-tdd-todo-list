package com.booleanuk.extension;

import java.util.HashMap;
import java.util.Map;

public class ExtensionToDoList {
   public Map<Integer,ExtensionTask> tasks = new HashMap();
    public ExtensionTask getTask(int id){
        if(tasks.containsKey(id)){
        return tasks.get(id);
        }
        return null;
    }
    public void updateTaskName(int id,String newName){
        if(!newName.equals("")){
            tasks.put(id,new ExtensionTask(newName));
        }

    }
    public boolean changeTaskStatus(int id){
        if(tasks.containsKey(id)){
            tasks.get(id).changeStatus();
            return true;
        }return false;

    }
    public String getDateAndTime(int id){
        if(tasks.containsKey(id)){
            return tasks.get(id).getDateAndTime();
        }
        return "Task not found";
    }
}
