package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    TodoList todoList;

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testTask1() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1"));

        Assertions.assertEquals(1, todoList.tasks.size());
    }
    @Test
    public void testTask2() {
        Task task1 =new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);

        Assertions.assertTrue(todoList.getTasks().get(0).equals(task1));
    }

    @Test
    public void testRemove(){
        Task task1 =new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);
        Assertions.assertTrue(todoList.getTasks().contains(task1));

        todoList.removeTask(task1);

        Assertions.assertFalse(todoList.getTasks().contains(task1));
    }
}
