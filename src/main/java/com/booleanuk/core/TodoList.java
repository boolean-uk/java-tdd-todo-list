package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getAllTasks(){
        return tasks;
    }

    public void changeStatusOfTask(String content){
        Task  task = tasks.stream()
                .filter(t -> t.getContent().equals(content))
                .findFirst()
                .get();
        task.complete = !task.isComplete();
        //other method
//        for(Task task : tasks){
//            if(task.getContent().equals(content)){
//                boolean currentStatus = task.isComplete();
//                task.setComplete(!currentStatus);
//                return;
//            }
//        }
    }

    public List<Task> getAllCompletedTasks(){
        return tasks.stream().filter(task -> task.isComplete()).toList();
    }

    public List<Task> getAllUncompletedTasks(){
        return tasks.stream().filter(task -> !task.isComplete()).toList();
    }

    public String searchForATask(String content){
        for (Task task : tasks){
            if(task.getContent().equals(content)){
                return "";
            }
        }
        return "It wasn't found";
    }


}
