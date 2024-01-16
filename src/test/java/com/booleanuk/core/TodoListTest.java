package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertEquals(1, todoList.taskList.size());
    }

    @Test
    public void testAddExisting() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        String task2 = "Clean";
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertTrue(todoList.add(task2));
        Assertions.assertFalse(todoList.add(task));
        Assertions.assertEquals(2, todoList.taskList.size());

    }

    @Test
    public void testViewTask() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        todoList.add(task);
        String task2 = "Eat";
        todoList.add(task2);

        Assertions.assertEquals("Task:{Wash=Incomplete, Eat=Incomplete}", todoList.viewTask());
    }

    @Test
    public void testUpdateTask() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        todoList.add(task);
        String task2 = "Drink";
        todoList.add(task2);

        Assertions.assertEquals(task2+ " " + "Complete", todoList.updateTask(task2));
        Assertions.assertEquals("Speak Incomplete", todoList.updateTask("Speak"));
    }

    @Test
    public void testViewCompletedTask() {
        TodoList todoList = new TodoList();
        String task = "Wash";
        todoList.add(task);
        String task2 = "Eat";
        todoList.add(task2);

        Assertions.assertEquals("Task:{Speak=Complete, Drink=Complete}", todoList.viewCompletedTask());
    }
}
