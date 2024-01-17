package com.booleanuk.extension;

import java.util.HashMap;
import java.util.Map;

public class TodoListEX {

   private Map<Integer, Task> todolist = new HashMap<>();

    public TodoListEX() {

    }



    public Map<Integer, Task> getTodolist() {
        return new HashMap<>(todolist);
    }


    public Task getTaskById(int i) {
        return new Task(i);
    }

    public void addTaskToTodolist(Task task) {
        this.todolist.put(task.getId(), task);
    }


}
