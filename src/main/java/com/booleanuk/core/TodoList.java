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
    public int listTasks(){
        if(!this.list.isEmpty()){
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println("Task: " + i
                        + " Description: " + this.list.get(i).description
                        + " IsCompleted: " + this.list.get(i).isCompleted);
            }
            return list.size();
        }
        return 0;
    }

    public static void main(String[] args) {
        TodoList t = new TodoList();
        t.add("Need to brush my teeth");

        //System.out.println(t.list.get(0).description + t.list.get(0).isCompleted);
    }
}
