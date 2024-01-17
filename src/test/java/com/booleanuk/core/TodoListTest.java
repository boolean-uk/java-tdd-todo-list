package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToDoListTest {

    @Test
    public void canAddTask() {
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertTrue(todoList.add("Task"));

    }

    @Test
    public void alreadyTaskInList() {
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertFalse(todoList.add("Task"));

    }

    @Test
    public void canRemove(){
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertTrue(todoList.remove("Task"));
        Assertions.assertFalse(todoList.ts.containsKey("Task"));

    }

    @Test
    public void changeStatusTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        Assertions.assertTrue(todoList.setStatus("Run"));
    }


}
