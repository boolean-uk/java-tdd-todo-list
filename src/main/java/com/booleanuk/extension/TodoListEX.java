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
        return this.todolist.get(i);
    }

    public void addTaskToTodolist(Task task) {
        this.todolist.put(task.getId(), task);
    }

    public boolean updateTaskName(int id, String name) {
        if(this.todolist.containsKey(id)) {
            Task task = this.getTaskById(id);
            task.setName(name);
            return true;
        }

        return false;
    }


    public void testChangeTaskStatus(int i) {
        Task task = this.getTaskById(i);
        task.setStatusOfTask(!task.getStatus());

    }
}
