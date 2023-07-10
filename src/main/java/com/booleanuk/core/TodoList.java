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
}
