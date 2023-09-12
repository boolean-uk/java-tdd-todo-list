package com.booleanuk.core;

import java.util.*;

public class TodoList {
  HashMap<String, Boolean> taskList;

  public TodoList() {
    this.taskList = new LinkedHashMap<>();
  }

  public boolean addToTodoList(String task, boolean taskFinished) {
    if (this.taskList.containsKey(task)) {
      return false;
    }
    this.taskList.put(task, taskFinished);
    System.out.println("Taks added to todo list" + " " + taskList); // check to see what is in the tasklist
    return true;
  }

  public String getTasks() {
    if (this.taskList.isEmpty()) {
      return "You have no tasks on your todoList";
    }
    return "Task: " + String.join(", ", this.taskList.keySet());
  }

  public boolean changeStatus(String task, boolean newStatus) {
    if (taskList.containsKey(task)) {
      taskList.put(task, newStatus);
      System.out.println("Status of task changed" + " " + taskList);
      return true; // Status changed successfully
    }
    return false; // Task not found
  }

  public String getCompletedTasks() {
    List<String> completedTaskNames = new ArrayList<>();
    for (Map.Entry<String, Boolean> entry : taskList.entrySet()) {
      if (entry.getValue()) {
        completedTaskNames.add(entry.getKey());
      }
    }
    if (!completedTaskNames.isEmpty()) {
      return "Completed tasks: " + String.join(", ", completedTaskNames);
    } else {
      return "You don't have completed tasks";
    }
  }

  public String getInCompleteTasks() {
    List<String> inCompletedTaskNames = new ArrayList<>();
    for (Map.Entry<String, Boolean> entry : taskList.entrySet()) {
      if (!entry.getValue()) {
        inCompletedTaskNames.add(entry.getKey());
      }
    }
    if (!inCompletedTaskNames.isEmpty()) {
      return "Incomplete tasks: " + String.join(", ", inCompletedTaskNames);
    } else {
      return "You don't have incomplete tasks";
    }
  }

  public String searchForTask(String searchTerm) {
    for (String task : taskList.keySet()) {
      if (task.equals(searchTerm)) {
        return task;
      }
    }
    return "Task not found: " + searchTerm; //If task is not found
  }

  public boolean removeTask(String taskName) {
    if (taskList.containsKey(taskName)) {
      taskList.remove(taskName); //remove task
      System.out.println("Task is removed from list" + taskList);
      return true;
    }
    return false;
  }

  public String sortTaskAscending() {
    List<String> taskAscending = new ArrayList<>(this.taskList.keySet());
    Collections.sort(taskAscending);

    this.taskList.clear();
    for (String task : taskAscending) {
      this.taskList.put(task, false);
    }
    System.out.println("ordered list alphabetically" + taskAscending);
      return String.join(", ", taskAscending);
  }
}







