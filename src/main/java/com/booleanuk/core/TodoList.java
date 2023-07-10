package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public String task;
    public boolean status;

    ArrayList<TodoList> tasks = new ArrayList<TodoList>();

    public TodoList(){}

    public TodoList(String task, boolean status) {
        this.task = task;
        this.status = status;
    }

    public String add(String task, boolean status){
        tasks.add(new TodoList(task,status));
        return "Task added to to-do list";
    }

    public ArrayList<TodoList> seeAll(){
        return this.tasks;
    }

    public String statusChange(String task, boolean status){
        for (TodoList todo: this.tasks) {
            if(task.equals(todo.task)){
                this.status = status;
            }
        }
        return "Status changed";
    }

    public ArrayList<TodoList> getComplete(){
        ArrayList<TodoList> completedTasks = new ArrayList<>();
        for (TodoList todo : this.tasks) {
            if(todo.status){
                completedTasks.add(todo);
            }
        }
        return completedTasks;
    }

    public ArrayList<TodoList> getIncomplete(){
        ArrayList<TodoList> inCompletedTasks = new ArrayList<>();
        for (TodoList todo : this.tasks) {
            if(!todo.status){
                inCompletedTasks.add(todo);
            }
        }
        return inCompletedTasks;
    }

}
