package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    TodoList todoList;

    public TodoListTest() {
        this.todoList = new TodoList();
    }
    @Test
    public void addTest() {
        todoList.add("Running for 5km");

        Assertions.assertTrue(todoList.allTasks().containsKey("Running for 5km"));
    }

    @Test
    public void printingAllTasksTest() {
        todoList.add("Running for 5km ");
        todoList.add("Swimming for 30min ");
        todoList.add("Cycling for 10km ");

        Assertions.assertEquals(3, todoList.allTasks().size());
    }

    @Test
    public void changingOfStatusTest() {
        todoList.add("Running");


        Assertions.assertEquals(true,todoList.allTasks().get("Running").equals("incomplete"));

        todoList.changeStatusOfTask("Running");
        Assertions.assertEquals(false,todoList.allTasks().get("Running").equals("incomplete"));
    }

}
