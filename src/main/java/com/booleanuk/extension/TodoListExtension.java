package com.booleanuk.extension;

import com.booleanuk.core.Order;
import com.booleanuk.extension.StatusExtension;
import com.booleanuk.core.Task;

import java.util.ArrayList;

public class TodoListExtension {
    private ArrayList<TaskExtension> tasks;
    private int size;

    public TodoListExtension() {
        this.tasks = new ArrayList<>();
        this.size = 0;
    }

    public boolean add(TaskExtension task) {
        size++;
        return tasks.add(task);
    }

    public int size() {
        return this.size;
    }

    public void printList(ArrayList<TaskExtension> list, String description) {
        System.out.println("=== TaskExtension List (" + description + ") ===");
        if (list.isEmpty()) {
            System.out.println("\tNo tasks.");
        } else {
            for (TaskExtension task : list) {
                System.out.println("\tID #" + task.id() + ": " + task.title() + " (Timestamp: " + task.dateCreated() + ")");
            }
        }
        System.out.println("=================");
    }

    public ArrayList<TaskExtension> listAll() {

        printList(this.tasks, "All");
        return this.tasks;
    }

    public ArrayList<TaskExtension> listAll(StatusExtension status) {

        ArrayList<TaskExtension> newTaskList = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
            if (task.status() == status) {
                newTaskList.add(task);
            }
        }
        printList(newTaskList, status.toString());
        return newTaskList;
    }

    public boolean search(String taskTitle) {

        ArrayList <TaskExtension> searchResult = new ArrayList<>();
        for (TaskExtension task : this.tasks) {
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
        for (TaskExtension task : this.tasks) {
            if (task.id() == taskId) {
                System.out.println("Task ID #" + task.id() + " succesfully removed.");
                return true;
            }
        }
        System.out.println("Task with ID #" + taskId + " does not exist.");
        return false;
    }

    public ArrayList<TaskExtension> sortedList(Order order) {
        // Reference: https://www.w3schools.com/java/ref_arraylist_sort.asp
        ArrayList<TaskExtension> sortedList = this.tasks;

        if (order == Order.ASCENDING) {
            sortedList.sort( (a, b) -> { return a.title().compareTo(b.title());});
        } else if (order == Order.DESCENDING) {
            sortedList.sort( (a, b) -> { return -1 * a.title().compareTo(b.title());});
        }
        return sortedList;
    }

    public TaskExtension getTask(int taskId) {
        for (TaskExtension task : this.tasks) {
            if (task.id() == taskId) {
                return task;
            }
        }
        return null;
    }

    public boolean changeTitle(int taskId, String newTitle) {
        TaskExtension task = getTask(taskId);
        if (task != null) {
            task.changeTitle(newTitle);
            return true;
        }
        return false;
    }

    public boolean changeStatus(int taskId, StatusExtension newStatus) {
        TaskExtension task = getTask(taskId);
        if (task != null) {
            task.changeStatus(newStatus);
            return true;
        }
        return false;
    }

}
