package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void testReturnTrueIfTaskIsAddedToList() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        todoList.tasks.add(newTask);
        Assertions.assertTrue(todoList.tasks.contains(newTask));
    }
    @Test
    public void testReturnAllTasks() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("Laundry");
        Task newTask2 = new Task("Cleaning");
        Task newTask3 = new Task("Reading");
        todoList.tasks.add(newTask);
        todoList.tasks.add(newTask2);
        todoList.tasks.add(newTask3);
        Assertions.assertEquals("Laundry", todoList.tasks.get(0).name);
        Assertions.assertEquals("Cleaning", todoList.tasks.get(1).name);
        Assertions.assertEquals("Reading", todoList.tasks.get(2).name);
    }
}
