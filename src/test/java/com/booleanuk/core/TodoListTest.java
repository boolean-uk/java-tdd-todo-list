package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddTaskWorks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        boolean taskFinished = true;

        assertTrue(todoList.addToTodoList(task, taskFinished));
        Assertions.assertTrue(todoList.taskList.containsKey(task));
        Assertions.assertEquals(true, todoList.taskList.get(task));
    }
    @Test
    public void testGetTasksWorks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(taskTwo, true);
        todoList.addToTodoList(taskThree, false);
        todoList.addToTodoList(taskThree, false);

        Assertions.assertEquals(String.format("Tasks: Walk the dog, Iron shirts, Do the dishes", todoList.getTasks()));
    }
}

