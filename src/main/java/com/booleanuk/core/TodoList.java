package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
ArrayList<Task> tasks=new ArrayList<>();
public boolean add(Task task){
    boolean contains=tasks.contains(task);
    if(contains){
        return false;
    }else{
        tasks.add(task);
        return true;
    }
}
public boolean remove(Task task){
    boolean contains=tasks.contains(task);
    if(contains){
        tasks.remove(task);
        return true;
    }else{
        return false;
    }
}
public void changeStatus(int index){
    tasks.get(index).changeStatus();
}
public ArrayList<Task> getCompletedTasks(){
    ArrayList<Task> completed=new ArrayList<>();
    for(Task task : tasks){
        if(task.status){
            completed.add(task);
        }
    }
    return completed;
}
    public ArrayList<Task> getIncompletedTasks(){
        ArrayList<Task> incompleted=new ArrayList<>();
        for(Task task : tasks){
            if(!task.status){
                incompleted.add(task);
            }
        }
        return incompleted;
    }

    public String searchForTask(Task task){
        if(tasks.contains(task)){
            return "Task found";
        }
        return "Task not found";
    }
    public String getTaskAlphabeticallyAsc(){
    ArrayList<String> names=new ArrayList<>();
    for(Task task: tasks){
        names.add(task.name);
    }
        Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
    return String.join(", ", names);
    }
    public String getTaskAlphabeticallyDesc(){
        ArrayList<String> names=new ArrayList<>();
        for(Task task: tasks){
            names.add(task.name);
        }
        Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(names);
        return String.join(", ", names);
    }
}
