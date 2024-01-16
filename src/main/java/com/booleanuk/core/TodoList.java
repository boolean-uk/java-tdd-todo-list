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

    public static void main(String[] args) {

    }

}
