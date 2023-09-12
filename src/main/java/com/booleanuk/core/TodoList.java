package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
  HashMap<String, Boolean> taskList;

  public TodoList() {
    this.taskList = new HashMap<>();
  }

  public boolean addToTodoList(String task, boolean taskFinished) {
    if (this.taskList.containsKey(task)) {
      return false;
    }
    this.taskList.put(task, taskFinished);
    System.out.println("Taks added to todo list" + " " + taskList); // check to see what is in the tasklist
    return true;
  }
}
