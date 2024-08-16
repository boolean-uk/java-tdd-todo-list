package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks;
    private int size;

    public TodoList() {
        this.tasks = new ArrayList<>();
        this.size = 0;
    }

    public boolean add(Task task) {
        size++;
        return tasks.add(task);
    }

    public int size() {
        return this.size;
    }

    public void printList(ArrayList<Task> list, String description) {
        System.out.println("=== Task List (" + description + ") ===");
        if (list.isEmpty()) {
            System.out.println("\tNo tasks.");
        } else {
            for (Task task : list) {
                System.out.println("\tID #" + task.id() + ": " + task.title());
            }
        }
        System.out.println("=================");
    }

    public ArrayList<Task> listAll() {

        printList(this.tasks, "All");
        return this.tasks;
    }

    public ArrayList<Task> listAll(Status status) {

        ArrayList<Task> newTaskList = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.status() == status) {
                newTaskList.add(task);
            }
        }
        printList(newTaskList, status.toString());
        return newTaskList;
    }

    public boolean search(String taskTitle) {

        ArrayList <Task> searchResult = new ArrayList<>();
        for (Task task : this.tasks) {
            if(task.title().contains(taskTitle)) {
                searchResult.add(task);
            }
        }

        if (!searchResult.isEmpty()) {
            printList(searchResult, "Search Result");
            return true;
        }
        System.out.println("===\nSearch Result:\n\tNo tasks found.\n===");
        return false;
    }

    public boolean remove(int taskId) {
        for (Task task : this.tasks) {
            if (task.id() == taskId) {
                System.out.println("Task ID #" + task.id() + " succesfully removed.");
                return true;
            }
        }
        System.out.println("Task with ID #" + taskId + " does not exist.");
        return false;
    }

    public ArrayList<Task> sortedList(Order order) {
        // Reference: https://www.w3schools.com/java/ref_arraylist_sort.asp
        ArrayList<Task> sortedList = this.tasks;

        if (order == Order.ASCENDING) {
            sortedList.sort( (a, b) -> { return a.title().compareTo(b.title());});
        } else if (order == Order.DESCENDING) {
            sortedList.sort( (a, b) -> { return -1 * a.title().compareTo(b.title());});
        }
        return sortedList;
    }
}
