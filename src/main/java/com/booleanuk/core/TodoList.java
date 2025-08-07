package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String desc){
        Task newTask = new Task(desc);
        tasks.add(newTask);
    }

    public List<Task> getTasks(){
        return this.tasks;
    }

    public List<Task> getCompleteTasks(){
        List<Task> completeTasks = new ArrayList<>();

        for(Task task : this.tasks){
            if(task.getCompleteStatus()){
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public List<Task> getIncompleteTasks(){
        List<Task> completeTasks = new ArrayList<>();

        for(Task task : this.tasks){
            if(!task.getCompleteStatus()){
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public boolean search(String desc){
        for(Task task : this.tasks){
            if(task.getDescription().equals(desc)){
                return true;
            }
        }
        return false;
    }

    public boolean remove(String desc){
        for (int i = 0; i < this.tasks.size(); i++){
            if(desc.equals(this.tasks.get(i).getDescription())){
                this.tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Task> getAlphAsc(){
        List<Task> returnVal = new ArrayList<>(List.copyOf(this.tasks));

        returnVal.sort((a, b) -> {return a.getDescription().compareTo(b.getDescription());});
        return returnVal;
    }

    public List<Task> getAlphDesc(){
        List<Task> returnVal = new ArrayList<>(List.copyOf(this.tasks));

        returnVal.sort((a, b) -> {return b.getDescription().compareTo(a.getDescription());});
        return returnVal;
    }

}
