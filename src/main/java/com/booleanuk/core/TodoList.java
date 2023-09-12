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
}