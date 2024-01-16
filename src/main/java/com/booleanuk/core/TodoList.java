package com.booleanuk.core;

import java.awt.*;
import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> listOfTasks;

    public TodoList() {
        this.listOfTasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        try {
            this.listOfTasks.add(task);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Task> retrieveTasks () {
        try {
            for(Task task : this.listOfTasks) {
                System.out.println(task.name);
            }
        } catch (Exception e) {
            System.out.println("Error, returning empty list");
            return new ArrayList<>();
        }
        return this.listOfTasks;
    }

    public ArrayList<Task> getCompleteTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();
        try {
            for(Task task : this.listOfTasks) {
                if (task.status) {
                    System.out.println(task.name);
                    completedTasks.add(task);
                }
            }
        } catch (Exception e) {
            System.out.println("Error, returning empty list");
            return new ArrayList<>();
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {

    }

}
