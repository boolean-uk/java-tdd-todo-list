package com.booleanuk.core;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TodoList {
    HashMap<Integer, String> taskname;
    boolean status;
    LocalDateTime creation;
    HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<>();
        this.taskname = new HashMap<>();
        this.status = false;
        this.creation = LocalDateTime.now();


        tasks.put("Fiske", true);


    }



    public boolean addTask(String name, boolean status) {

        if (this.tasks.containsKey(name)) {
            return false;
        }


            tasks.put(name, status);




        return true;
    }

    public String allTasks() {

        return this.tasks.toString();
    }

    public boolean setStatus(String name, boolean status) {

        if (tasks.containsKey(name)) {
            tasks.put(name, status);
            return true;

        }

        return false;
    }

    public String getComplete() {

        return "";
    }

    public String getInComplete() {

        return "";
    }

    public String getTask() {

        return "";
    }

    public boolean removeTask(int id) {


        return true;
    }

    public HashMap<Integer, String> ascending() {

        return new HashMap<>();
    }

    public HashMap<Integer, String> descending() {

        return new HashMap<>();
    }

  /*  public static void main(String[] args) {
        TodoList task = new TodoList();
        task.taskname.put(78, "Hei");
        task.status = true;
        task.creation = LocalDateTime.now();
        TodoList task1 = new TodoList();


        task1.addTask(10, "Play");

        System.out.println(task1.allTasks());
    }*/


}
