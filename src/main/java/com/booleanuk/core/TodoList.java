package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public static class Task{
        String description;
        boolean isCompleted;
        public Task(String task){
            this.description = task;
            this.isCompleted = false;
        }
    }
    ArrayList<Task> list;
    public TodoList(){
        this.list = new ArrayList<>();
    }

    public boolean add(String taskDescription){
        if(taskDescription.isEmpty()){
            return false;
        }
        Task task = new Task(taskDescription);
        list.add(task);
        return true;
    }

    public static void main(String[] args) {
        TodoList t = new TodoList();
        t.add("Need to brush my teeth");

        //System.out.println(t.list.get(0).description + t.list.get(0).isCompleted);
    }
}
