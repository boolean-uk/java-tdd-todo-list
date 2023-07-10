package com.booleanuk.core;


public class Task implements Comparable<Task> {

    public static int id_counter = 0;
    private final int id;
    private String name;
    private boolean completed;

    public Task (String name) {
        this.id = id_counter++;
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean getCompleted() {
        return completed;
    }

    public int getId() {
        return id;
    }

    public void toggleCompleted() {
        this.completed = !this.completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Task task) {
        return this.name.compareTo(task.name);
    }
}
