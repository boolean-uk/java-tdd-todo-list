package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String name){
        Task newTask = new Task(name);
        this.tasks.add(newTask);
    }

}
